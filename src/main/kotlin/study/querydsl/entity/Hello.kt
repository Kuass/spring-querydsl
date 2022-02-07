package study.querydsl.entity

import lombok.Getter
import lombok.Setter
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@Getter
@Setter
class Hello {

    @Id @GeneratedValue
    var id: Long = 0
}