package com.shriram.httpclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    TodoDeclarativeClient todoDeclarativeClient;
    TraditionalTodoService service;

    public TodoController(TodoDeclarativeClient todoDeclarativeClient, TraditionalTodoService service) {
        this.service = service;
        this.todoDeclarativeClient = todoDeclarativeClient;
    }
    @GetMapping("/todos")
    public List<Todo> findAll() {
        return todoDeclarativeClient.findAll();
    }

    @GetMapping("/traditional/todos")
    public List<Todo> traditionalAll() {
        return service.findAll();
    }
}
