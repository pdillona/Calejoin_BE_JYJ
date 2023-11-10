package kr.co.calejoin.repotest;

import kr.co.calejoin.entity.UserEntity;
import kr.co.calejoin.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import jakarta.transaction.Transactional;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("회원가입 테스트")
    @Transactional
    public void joinUser(){
        UserEntity user = userRepository.save(
                UserEntity.builder()
                        .uid("dd")
                        .nick("aa")
                        .accessToken("token")
                        .type("USER")
                        .build()
        );

        System.out.println(userRepository.save(user));
    }
}
