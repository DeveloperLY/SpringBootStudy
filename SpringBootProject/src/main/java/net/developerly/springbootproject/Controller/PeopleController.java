package net.developerly.springbootproject.controller;

import net.developerly.springbootproject.domain.People;
import net.developerly.springbootproject.domain.Result;
import net.developerly.springbootproject.repository.PeopleRepository;
import net.developerly.springbootproject.service.PeopleService;
import net.developerly.springbootproject.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author LY
 * @create 2017/10/01
 **/
@RestController
public class PeopleController {
    private final static Logger logger = LoggerFactory.getLogger(PeopleController.class);

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
    public Result<People> addPeople(@Valid People people, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(peopleRepository.save(people));
    }

    @GetMapping(value = "/queryById/{id}")
    public Result<People> getPeople(@PathVariable("id") Integer id) throws Exception {
        return ResultUtil.success(peopleService.getPeopleById(id));
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
