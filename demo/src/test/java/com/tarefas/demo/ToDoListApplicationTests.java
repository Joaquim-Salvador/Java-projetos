package com.tarefas.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.tarefas.entity.ToDo;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
class ToDoListApplicationTests {

	@Autowired
	private WebTestClient webTestClient;
	@Test
	void testCreatToDoSuccess() {
		var todo = new ToDo("todo 1", "descricao 1", false, 1);
	
		webTestClient
		.post()
		.uri("/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isOk()
		.expectBody()
		.jsonPath("$").isArray()
		.jsonPath("$.length()").isEqualTo(1)
		.jsonPath("$[0].nome").isEqualTo(todo.getNome())
		.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
		.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
		.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}

		@Test
	void testCreatToDoFailure() {
				webTestClient
		.post()
		.uri("/todos")
		.bodyValue(new ToDo("", "", false, 0))
		.exchange()
		.expectStatus().isBadRequest();
	}

}
