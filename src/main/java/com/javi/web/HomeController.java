package com.javi.web;

import com.javi.dao.PersonDAO;
import com.javi.domain.Person;
import com.javi.service.IPersonService;
import com.javi.service.PersonServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Slf4j  ///Manejo de login
public class HomeController {

    @Autowired
    private IPersonService personService;

    @GetMapping("/")
    public String home(Model model){
         var persons = personService.listPersons();

         model.addAttribute("persons", persons);
        return "index";
    }

    @GetMapping("/add")
    public String add(Person person){
        return "modify";
    }

    @PostMapping("/save")
    public String save(@Valid Person person, Errors errors){
        if(errors.hasErrors()){
            return "modify";
        }
        personService.save(person);
        return "redirect:/";
    }

    @GetMapping("/modify/{idPerson}")
    public String modify(Person person, Model model){
        person = personService.findPerson(person);
        model.addAttribute("person", person);
        return "modify";
    }

    @GetMapping("/delete")
    public String delete(Person person){
        personService.delete(person);
        return "redirect:/";
    }
}
