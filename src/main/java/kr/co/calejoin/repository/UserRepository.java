package kr.co.calejoin.repository;

import kr.co.calejoin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    
}
