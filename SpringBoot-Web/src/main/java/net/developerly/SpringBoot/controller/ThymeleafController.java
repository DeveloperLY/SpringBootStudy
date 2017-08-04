package net.developerly.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author LY
 * @create 2017/08/04
 **/
@Controller
public class ThymeleafController {

    @RequestMapping("hi")
    public String helle(Locale locale, Model model) {
        model.addAttribute("greeting", "Hello Thymeleaf!");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formattedDate);
        return "hello";
    }


}
