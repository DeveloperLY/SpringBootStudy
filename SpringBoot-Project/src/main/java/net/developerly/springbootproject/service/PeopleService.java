package net.developerly.springbootproject.service;

import net.developerly.springbootproject.domain.People;
import net.developerly.springbootproject.enums.ResultEnum;
import net.developerly.springbootproject.exception.PeopleException;
import net.developerly.springbootproject.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author LY
 * @create 2017/10/01
 **/
@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;

    @Transactional
    public void inserTwo() {
        People people = new People();
        people.setName("iOS");
        people.setAge(11);

        peopleRepository.save(people);

        People people2 = new People();
        people2.setName("iOS 11");
        people2.setAge(33);

        peopleRepository.save(people2);
    }

    public People getPeopleById(Integer id) throws Exception {
        People people = peopleRepository.findOne(id);
        if (people.getName().equals("")) {
            throw new PeopleException(ResultEnum.NAME_NULL);
        } else if (people.getAge() == 0) {
            throw new PeopleException(ResultEnum.AGE_NULL);
        } else if (people == null) {
            throw new PeopleException(ResultEnum.ALL_NULL);
        }
        return people;
    }

    public People findOne(Integer id) {
        return peopleRepository.findOne(id);
    }
}
