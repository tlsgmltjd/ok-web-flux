package com.example.okwebflux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.util.Arrays;

@Slf4j
public class ColdSequence {
    public static void main(String[] args) {
        Flux<String> coldFlux = Flux.fromIterable(Arrays.asList("A", "B", "C"));

        coldFlux.subscribe(data -> log.info("data={}", data));
        log.info("===================");
        coldFlux.subscribe(data -> log.info("data={}", data));
    }
}
