package tech.buildrun.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ApiController {

    private final List<String> tasks = new ArrayList<>();
    private final ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping(path = "/tasks")
    public ResponseEntity<String> listTasks() throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
    }

    @PostMapping(path = "/tasks")
    public ResponseEntity<Void> createTask(@RequestBody String task) {
        tasks.add(task);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/tasks")
    public ResponseEntity<Void> clearTasks() {
        tasks.clear(); // Limpa a lista existente
        return ResponseEntity.ok().build();
    }
}
// Colar no CMD para o programa funcionar

// Rodar o servidor: mvn spring-boot:run
// Adicionar tarefa: curl -X POST http://localhost:8080/tasks -H "Content-Type: text/plain" -d "Estudar Java"
// Ver as tarefas: curl -X GET http://localhost:8080/tasks
// Adicionar outra tarefa: curl -X POST http://localhost:8080/tasks -H "Content-Type: text/plain" -d "Treinar Spring Boot"
// Limpar todas as tarefas: curl -X DELETE http://localhost:8080/tasks

