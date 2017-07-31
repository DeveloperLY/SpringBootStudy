package net.developerly.SpringBoot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LY
 * @create 2017/07/31
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);
}
