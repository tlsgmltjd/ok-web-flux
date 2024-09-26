package com.example.okwebflux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class FluxExample02 {
    public static void main(String[] args) {
        Flux.fromArray(new Integer[]{6, 9, 10})
                .filter(num -> num > 5)
                .map(num -> num * 2)
                .subscribe(data -> log.info(String.valueOf(data)));
    }
}
