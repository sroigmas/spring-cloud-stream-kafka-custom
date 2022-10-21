package com.github.sroigmas.spring.cloud.stream.kafka.custom.binder;

import com.github.sroigmas.spring.cloud.stream.kafka.custom.event.Greetings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GreetingsListener {

  @StreamListener(GreetingsStreams.INPUT)
  public void processGreetings(Greetings greetings) {
    log.info("Received greetings: {}", greetings);
  }
}
