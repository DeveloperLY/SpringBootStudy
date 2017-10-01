package net.developerly.springbootproject.Controller;

import net.developerly.springbootproject.Model.People;
import net.developerly.springbootproject.Repository.PeopleRepository;
import net.developerly.springbootproject.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LY
 * @create 2017/10/01
 **/
@RestController
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private PeopleService peopleService;

    @GetMapping(value = "/peoples")
    public List<People> peopleList() {
        return peopleRepository.findAll();
    }

    @GetMapping(value = "/peoples/age/{age}")
    public List<People> peoplesByAge(@PathVariable("age") Integer age) {
        return peopleRepository.findByAge(age);
    }

    @PostMapping(value = "/addPeople")
    public People addPeople(@RequestParam("name") String name,
                            @RequestParam("age") Integer age) {

        People people = new People();
        people.setName(name);
        people.setAge(age);

        return peopleRepository.save(people);
    }

    @GetMapping(value = "/queryById/{id}")
    public People getPeople(@PathVariable("id") Integer id)  {
        return peopleRepository.findOne(id);
    }

    @PutMapping(value = "/updateById/{id}")
    public People updatePeople(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age)  {
        People people = new People();
        people.setId(id);
        people.setName(name);
        people.setAge(age);
        return peopleRepository.save(people);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void delete(@PathVariable("id") Integer id) {
        peopleRepository.delete(id);
    }


    @PostMapping(value = "/insertTwo")
    public void insertTwo() {
        peopleService.inserTwo();
    }

}
