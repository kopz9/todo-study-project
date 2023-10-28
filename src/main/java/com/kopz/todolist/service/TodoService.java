package com.kopz.todolist.service;


import com.kopz.todolist.entity.Todo;
import com.kopz.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;


    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return findAll();
    }

    public List<Todo> findAll(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return findAll();

    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return findAll();
    }

    public Optional<Todo> findByID(Long id){
        return todoRepository.findById(id);
    }

}
