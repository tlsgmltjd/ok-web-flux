package com.example.okwebflux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public class MonoExample02 {
    public static void main(String[] args) {
        Mono.empty()
                .subscribe(
                        data -> log.info("emitted data = {}", data), // emit 된 데이터 처리
                        error -> { // 에러 발생시 처리
                        },
                        () -> log.info("emitted onComplete signal") // 모든 데이터가 emit된 후 onComplete처리
                );
    }
}
