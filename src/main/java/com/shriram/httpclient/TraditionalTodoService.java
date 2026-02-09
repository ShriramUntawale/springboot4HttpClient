package com.shriram.httpclient;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class TraditionalTodoService {

    private final RestClient client;

    public TraditionalTodoService(RestClient.Builder builder) {
        this.client = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    public List<Todo> findAll() {
        return client.get()
                .uri("/todos")
                .retrieve()
                .body(new org.springframework.core.ParameterizedTypeReference<List<Todo>>() {});
    }

    public Todo findById(Integer id) {
        return client.get()
                .uri("/todos/{id}", id)
                .retrieve()
                .body(Todo.class);
    }
}
