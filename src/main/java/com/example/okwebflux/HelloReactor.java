package com.example.okwebflux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
public class HelloReactor {
    public static void main(String[] args) {
        Mono.just("Hello, Reactor")
                .subscribe(System.out::println);


        Flux<String> sequence = Flux.just("Hello", "Reactor");
        sequence
                .map(data -> data.toLowerCase())
                .subscribe(data -> log.info(data));
    }
}
