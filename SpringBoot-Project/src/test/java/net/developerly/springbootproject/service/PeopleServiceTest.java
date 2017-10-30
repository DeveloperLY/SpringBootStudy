package net.developerly.springbootproject.service;

import net.developerly.springbootproject.domain.People;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeopleServiceTest {

    @Autowired
    private PeopleService peopleService;

    @Test
    public void findOne() throws Exception {
        People people = peopleService.getPeopleById(2);
        Assert.assertEquals("zhangsan", people.getName());
    }

}