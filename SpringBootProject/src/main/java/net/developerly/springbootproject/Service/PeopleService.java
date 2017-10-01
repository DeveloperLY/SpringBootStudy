package net.developerly.springbootproject.Service;

import net.developerly.springbootproject.Model.People;
import net.developerly.springbootproject.Repository.PeopleRepository;
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
}
