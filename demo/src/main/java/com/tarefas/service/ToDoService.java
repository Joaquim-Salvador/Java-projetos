package com.tarefas.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tarefas.entity.ToDo;
import com.tarefas.repository.ToDoRepository;

@Service
public class ToDoService {
private ToDoRepository todoRepository;

public ToDoService(ToDoRepository todoRepository){
    this.todoRepository = todoRepository;
}
    
    public List<ToDo> create(ToDo todo){
        todoRepository.save(todo);
        return list();
    }
        public List<ToDo> list(){
            Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
            );
        return todoRepository.findAll(sort);
    }
        public List<ToDo> uptade(ToDo todo){
            todoRepository.save(todo);
            return list();
    }
        public List<ToDo> delete(Long id){
            todoRepository.deleteById(id);
            return list();
    }
}
