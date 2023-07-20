package kr.ezen.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.Date;

@SpringBootApplication // 모든 환경변수 가져와줌
public class JpaDemoApplication implements CommandLineRunner {

    @Autowired
    EntityManagerFactory emf; // 인스턴스 변수

    public static void main(String[] args) {
//        SpringApplication.run(JpaDemoApplication.class, args);
//        System.out.println("spring boot!!");
//        emf
        SpringApplication app = new SpringApplication(JpaDemoApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE); // 톰캣 동작안하는 타입
        app.run();
    }

    @Override // 인스턴스 메소드
    public void run(String... args) throws Exception {
//        System.out.println("emf = " + emf);
//
//        EntityManager em = emf.createEntityManager();
//
//        Customer customer = new Customer();
//        customer.setId("test");
//        customer.setPassword("1234");
//        customer.setName("홍길동");
//        customer.setEmail("test@gmail.com");
//        customer.setInDate(new Date());
//        customer.setUpDate(new Date());
//
//        EntityTransaction tx = em.getTransaction();
//
//        // 저장
//        tx.begin();
//        em.persist(customer); // 영속화
//
//        // 수정
//        customer.setName("박길동");
//        customer.setEmail("aaaa@gmail.com");
//        em.persist(customer);
//
//        tx.commit();
//
//        // 조회
//        Customer customer2 = em.find(Customer.class, "test");
//        System.out.println("customer == customer2 = " + (customer == customer2));
//
//        Customer customer3 = em.find(Customer.class, "demo");
//        // demo가 엔티티 매니저 안에 없기 때문에 DB를 조회함.
//        System.out.println("customer3 = " + customer3); // null, DB테이블에 존재하지 않음
//
//        // 삭제
//        tx.begin();
//        em.remove(customer);
//        tx.commit();
    }
}
