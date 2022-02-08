package study.querydsl.entity

import lombok.*
import javax.persistence.*

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = ["team"])
class Member(usernameParam: String, ageParam: Int, teamParam: Team?) {

    @Id @GeneratedValue
    @Column(name = "member_id")
    var id: Long = 0
    lateinit var username: String
    var age: Int = 0

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    lateinit var team: Team

    constructor(usernameParam: String) : this(usernameParam, 0, null)
    constructor(usernameParam: String, ageParam: Int) : this(usernameParam, ageParam, null)

    init {
        this.username = usernameParam
        this.age = ageParam
        if (teamParam != null) changeTeam(teamParam)
    }

    private final fun changeTeam(team: Team) {
        this.team = team
        team.members.add(this)
    }
}