package kr.ezen.jpademo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ManyToOneTest {

    @Autowired
    private EntityManager em;

    @Autowired
    private BbsRepository bbsRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    @Transactional
    public void manyToOneTest(){
        Customer customer = new Customer();
        customer.setId("tttt");
        customer.setPassword("1212");
        customer.setName("홍길동");
        customer.setEmail("hong@gmail.com");
        customer.setInDate(new Date());
        customer.setUpDate(new Date());

        customerRepository.save(customer);

        Bbs bbs1 = new Bbs();
        bbs1.setBno(1L);
        bbs1.setTitle("title1");
        bbs1.setContent("content1");
        bbs1.setCustomer(customer);
        bbs1.setViewCnt(0L);
        bbs1.setRegDate(new Date());
        bbs1.setUpDate(new Date());

        bbsRepository.save(bbs1);

        Bbs bbs2 = new Bbs();
        bbs2.setBno(1L);
        bbs2.setTitle("title2");
        bbs2.setContent("content2");
        bbs2.setCustomer(customer);
        bbs2.setViewCnt(0L);
        bbs2.setRegDate(new Date());
        bbs2.setUpDate(new Date());

        bbsRepository.save(bbs2);

        System.out.println("bbs1 = " + bbs1);
        System.out.println("bbs2 = " + bbs2);

        assertTrue(bbs1!=null);
        assertTrue(bbs2!=null);

        // FetchType.EAGER
//        customer = customerRepository.findById(customer.getId()).orElse(null);
//        System.out.println("customer = " + customer);
//        assertTrue(customer!=null);

        customer = customerRepository.findById(customer.getId()).orElse(null);
        System.out.println("customer = " + customer);
//        System.out.println("customer.getList() = " + customer.getList());
        assertTrue(customer!=null);
    }
}