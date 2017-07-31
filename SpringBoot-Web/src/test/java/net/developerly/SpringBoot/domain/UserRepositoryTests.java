package net.developerly.SpringBoot.domain;

import net.developerly.SpringBoot.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author LY
 * @create 2017/07/31
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new User("ly", "123456", "coderly@gmail.com", "Developerly", formattedDate));
        userRepository.save(new User("zs", "123456", "zhangsan@gmail.com", "zhangsan", formattedDate));
        userRepository.save(new User("ls", "ls123456", "lisi@gmail.com", "lisi", formattedDate));

        Assert.assertEquals(9, userRepository.findAll().size());
        Assert.assertEquals("ly", userRepository.findByUserNameOrEmail("ly", "coderly@gmail.com").getNickName());
        userRepository.delete(userRepository.findByUserName("lisi"));
    }
}
