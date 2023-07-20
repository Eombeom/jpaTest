package kr.ezen.jpademo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Member3 {
    @Id
    @Column(name = "member_id")
    private Long id;
    private String password;
    private String name;
    private String email;

    //@OneToOne
    // 관계형 데이터베이스에서는 FK가 하나면 양방향이 된다.

    // FK가 만들어짐
    //@JoinColumn(name="cart_id")
    // 두개의 FK가 만들어짐

    @OneToOne(mappedBy = "member3")
    private Cart cart;

    @Override
    public String toString() {
        return "Member3{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cart=" + cart +
                '}';
    }
}
