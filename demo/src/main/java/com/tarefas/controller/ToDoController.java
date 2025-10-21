package com.tarefas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarefas.entity.ToDo;
import com.tarefas.service.ToDoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    private ToDoService toDoService;
    
    
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }
    @PostMapping
    List<ToDo> create(@RequestBody @Valid ToDo todo) {
        return toDoService.create(todo);
    }

    @GetMapping
        List<ToDo> list() {
    return toDoService.list();
    }

    @PutMapping
        List<ToDo> update(@RequestBody ToDo todo) {
    return toDoService.uptade(todo);
    }

    @DeleteMapping("{id}")
        List<ToDo> delete(@PathVariable Long id) {
    return toDoService.delete(id);
    }

}
