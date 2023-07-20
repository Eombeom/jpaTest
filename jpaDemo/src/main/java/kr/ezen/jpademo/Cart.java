package kr.ezen.jpademo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cart {
    @Id
    @Column(name = "cart_id")
    private Long id;

    @OneToOne
    // nullable = false ----> inner Join
    // nullable = true(기본값) ----> outer Join
    @JoinColumn(name = "member_id", nullable = false)
    private Member3 member3;

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
//                ", member3=" + member3 +
                '}';
    }
}
