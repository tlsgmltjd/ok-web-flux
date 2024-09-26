package com.example.okwebflux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

// Flux + Flux = Flux
@Slf4j
public class FluxExample04 {
    public static void main(String[] args) {
        Flux.concat(
                Flux.just("1", "2"),
                Flux.just("3", "4"),
                Flux.just("5", "6")
        )
        .collectList()
        .subscribe(data -> log.info("data = {}", data));
    }
}
