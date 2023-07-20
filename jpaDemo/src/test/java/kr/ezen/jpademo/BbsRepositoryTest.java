package kr.ezen.jpademo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BbsRepositoryTest {
//    @Autowired
//    private BbsRepository bbsRepository;
//
//    // 저장 테스트
//    @Test
//    @Order(1)
//    public void insertTest(){
//        Bbs bbs = new Bbs();
//        bbs.setBno(1L);
//        bbs.setTitle("테스트 ~~~~~~");
//        bbs.setContent("테스트 컨텐츠....");
//        bbs.setWriter("홍길동");
//        bbs.setViewCnt(0L);
//        bbs.setRegDate(new Date());
//        bbs.setUpDate(new Date());
//
//        bbsRepository.save(bbs);
//    }
//
//    @Test
//    @Order(2)
//    public void selectTest(){
////        Bbs bbs = bbsRepository.findById(1L).get();
//
//        // orElse() 값이 없으면 null을 반환 => NPE(NullPoint Exception)을 발생시키지 않음
//        Bbs bbs = bbsRepository.findById(1L).orElse(null);
//        System.out.println("bbs = " + bbs);
//        assertTrue(bbs != null);
//    }
//
//    @Test
//    @Order(3)
//    public void updateTest(){
//        Bbs bbs = bbsRepository.findById(1L).orElse(null);
//
//        bbs.setTitle("제목 수정수정~~~");
//        bbsRepository.save(bbs);
//    }
//
//    @Test
//    public void deleteTest(){
//        bbsRepository.deleteById(1L);
//
//        Bbs bbs = bbsRepository.findById(1L).orElse(null);
//        assertTrue(bbs == null);
//    }
}