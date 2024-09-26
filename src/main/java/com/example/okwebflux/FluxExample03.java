package com.example.okwebflux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

// Mono + Mono = Flux
@Slf4j
public class FluxExample03 {
    public static void main(String[] args) {
        Flux<Object> sequence = Mono.justOrEmpty(null)
                .concatWith(
                        Mono.justOrEmpty("hi")
                );
        sequence.subscribe(data -> log.info("data = {}", data));
    }
}
