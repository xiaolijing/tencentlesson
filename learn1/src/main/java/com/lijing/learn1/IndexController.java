package com.lijing.learn1;

import com.lijing.demo.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/index")
    public String sayHello(){
        System.out.println("say hello");


        return "say Hello";
    }
    @RequestMapping(value = "/find/{id}/{name}",produces = "application/json; charset=utf-8")
    public User find(@PathVariable Integer id,@PathVariable String name){
        User user = new User();
        user.setName(name);
        user.setId(id);
        return user;
    }
}

