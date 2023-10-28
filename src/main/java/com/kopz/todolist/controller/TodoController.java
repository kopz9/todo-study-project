package com.kopz.todolist.controller;

import com.kopz.todolist.entity.Todo;
import com.kopz.todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@Valid @RequestBody Todo todo){
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> list(){
        return todoService.findAll();
    }


    @GetMapping("/{id}")
    Optional<Todo> list(@PathVariable Long id){
        return todoService.findByID(id);
    }


    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("/{id}")
    List<Todo> delete(@PathVariable Long id){
        return todoService.delete(id);

    }



}
