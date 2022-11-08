package com.personalsoft.afsilva.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    @RequestMapping(value = "list-todos")
    public String listAllTodos(){
        return  "ListTodos";
    }


}
