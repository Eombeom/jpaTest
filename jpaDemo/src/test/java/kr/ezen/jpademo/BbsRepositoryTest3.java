package kr.ezen.jpademo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BbsRepositoryTest3 {
//    @Autowired
//    private BbsRepository bbsRepository;
//
//    @Autowired
//    private EntityManager em;
//
//    @BeforeEach // Test가 실행되기 전에 수행됨
//    public void dummyData() {
//        for (int i = 1; i <= 100; i++) {
//            Bbs bbs = new Bbs();
//            bbs.setBno((long) i);
//            bbs.setTitle("title" + i);
//            bbs.setContent("content" + i);
//            bbs.setWriter("writer" + (i % 10)); // writer1 ~ 10
//            bbs.setViewCnt((long) (Math.random() * 100)); // 0 ~ 99
//            bbs.setRegDate(new Date());
//            bbs.setUpDate(new Date());
//
//            bbsRepository.save(bbs);
//        }
//    }
//
//    @Test
//    @DisplayName("쿼리를 직접생성해서 JPQL 작성 테스트")
//    public void createQueryTest() {
//        String query = "SELECT b FROM Bbs b";
//        TypedQuery<Bbs> tQuery = em.createQuery(query, Bbs.class);
//        List<Bbs> list = tQuery.getResultList();
//
////        list.forEach(System.out::println);
//        list.forEach(p -> System.out.println(p));
//
//        assertTrue(list.size() == 100);
//    }
//
//    @Test
//    @DisplayName("@Query 작성 테스트")
//    public void queryAnnoTest(){
//        List<Bbs> list = bbsRepository.findAll();
//        assertTrue(list.size()==100);
//    }
//
//    @Test
//    @DisplayName("@Query 작성 테스트2")
//    public void queryAnnoTest2(){
//        List<Bbs> list = bbsRepository.findByTitleAndWriter("title1", "writer1");
//        assertTrue(list.size()==1);
//    }
//
//    @Test
//    @DisplayName("@Query 작성 테스트3")
//    public void queryAnnoTest3(){
//        List<Bbs> list = bbsRepository.findByTitleAndWriter("title1", "writer1");
//        assertTrue(list.size()==1);
//    }
//
//    @Test
//    @DisplayName("@Qeury Native 쿼리 테스트1")
//    public void nativeQueryTest(){
//        List<Bbs> list = bbsRepository.findAllBySQL();
//        assertTrue(list.size()==100);
//    }
//    @Test
//    @DisplayName("@Qeury Native 쿼리 테스트2")
//    public void nativeQueryTest2(){
//        List<Object[]> list = bbsRepository.findAllBySQL2();
////        list.forEach(System.out::println);
////        list.forEach(obj -> System.out.println(obj));
//        list.stream()
//                .map(arr -> Arrays.toString(arr))
//                .forEach(System.out::println);
//        assertTrue(list.size()==100);
//    }
}