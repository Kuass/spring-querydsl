package study.querydsl.entity

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.annotation.Commit
import org.springframework.transaction.annotation.Transactional

//import javax.transaction.Transactional

@Transactional
@Commit
@DataJpaTest
class MemberTest_Back @Autowired constructor(
        val em: TestEntityManager) {

    @Test
    fun testEntity() {
        val teamA = Team("teamA")
        val teamB = Team("teamB")
        em.run {
            persist(teamA)
            persist(teamB)
        }

//        val member1 = Member("member1", 10, teamA)
//        val member2 = Member("member2", 20, teamA)
//        val member3 = Member("member3", 30, teamA)
//        val member4 = Member("member4", 40, teamA)
//        em.persist(member1)
//        em.persist(member2)
//        em.persist(member3)
//        em.persist(member4)
//
//        // 초기화
//        em.flush()
//        em.clear()
//
//        // 확인
//        val members = em.createQuery("SELECT m FROM Member m", Member::class.java).resultList
//            .forEach {
//                println("member = $it")
//                println("-> member.team : ${it.team}")
//            }
    }
}