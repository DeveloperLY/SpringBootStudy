package net.developerly.springbootproject.repository;

import net.developerly.springbootproject.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author LY
 * @create 2017/10/01
 **/
public interface PeopleRepository extends JpaRepository<People, Integer> {
    // 通过年龄查询
    public List<People> findByAge(Integer age);
}
