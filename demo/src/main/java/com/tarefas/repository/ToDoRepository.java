package com.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarefas.entity.ToDo;



public interface  ToDoRepository extends JpaRepository<ToDo, Long>{
    
}
