package kr.ezen.jpademo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OneToOneTest {

    @Autowired
    private EntityManager em;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private CartRepository cartRepository;

    @Test
    public void oneToOneTest(){
        Member3 member3 = new Member3();
        member3.setId(1L);
        member3.setName("홍길동");
        member3.setEmail("test@gmail.com");
        member3.setPassword("1234");

        memberRepository.save(member3);

        Cart cart = new Cart();
        cart.setId(1L);
        cart.setMember3(member3);
        cartRepository.save(cart);

        cart = cartRepository.findById(cart.getId()).orElse(null);
        assertTrue(cart != null);
        System.out.println("cart = " + cart);

        // 양방향 연결
        member3 = memberRepository.findById(member3.getId()).orElse(null);
        System.out.println("member = " + member3);

        assertTrue(member3 != null);
    }
}