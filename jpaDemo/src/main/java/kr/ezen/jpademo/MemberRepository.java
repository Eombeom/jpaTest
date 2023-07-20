package kr.ezen.jpademo;


import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member3, Long> {}
