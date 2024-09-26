package com.example.okwebflux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.stream.Stream;

@Slf4j
public class HotSequence {
    public static void main(String[] args) throws InterruptedException {
        Flux<String> coldFlux = Flux.fromStream(Stream.of("A", "B", "C"))
                .delayElements(Duration.ofSeconds(1))
                .share();

        coldFlux.subscribe(data -> log.info("data={}", data));
        Thread.sleep(2500);
        coldFlux.subscribe(data -> log.info("data={}", data));
        Thread.sleep(3000);
    }
}
