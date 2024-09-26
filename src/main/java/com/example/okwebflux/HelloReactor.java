package com.example.okwebflux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class HelloReactor {
    public static void main(String[] args) {
        Flux<String> sequence = Flux.just("Hello", "Reactor");

        sequence
                .map(data -> data.toLowerCase())
                .subscribe(data -> log.info(data));
    }
}
