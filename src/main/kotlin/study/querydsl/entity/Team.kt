package study.querydsl.entity

import lombok.*
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = ["members"])
class Team(nameParam: String) {

    @Id
    @Column(name = "id", nullable = false)
    var id: Long = 0
    lateinit var name: String

    @OneToMany(mappedBy = "team")
    var members: MutableList<Member> = mutableListOf()

    init {
        this.name = nameParam
    }

}