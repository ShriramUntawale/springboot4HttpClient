package com.shriram.httpclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class RestClientConfig {

    @Bean
    RestClient todoRestClient(
            RestClient.Builder builder
    ) {
        return builder
                .baseUrl("http://jsonplaceholder.typicode.com")
                //.defaultHeader("User-Agent", "Spring5RestClient")
                .build();
    }
    @Bean
    TodoDeclarativeClient todoDeclarativeClient(RestClient todoRestClient) {
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(
                RestClientAdapter.create(todoRestClient)
        ).build();
        return factory.createClient(TodoDeclarativeClient.class);
    }
}