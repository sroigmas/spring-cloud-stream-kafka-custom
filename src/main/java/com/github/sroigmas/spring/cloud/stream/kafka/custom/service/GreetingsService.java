package com.github.sroigmas.spring.cloud.stream.kafka.custom.service;

import com.github.sroigmas.spring.cloud.stream.kafka.custom.binder.GreetingsStreams;
import com.github.sroigmas.spring.cloud.stream.kafka.custom.event.Greetings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class GreetingsService {

  private final GreetingsStreams greetingsStreams;

  public GreetingsService(GreetingsStreams greetingsStreams) {
    this.greetingsStreams = greetingsStreams;
  }

  public void sendGreetings(final Greetings greetings) {
    log.info("Sending greetings {}", greetings);

    MessageChannel messageChannel = greetingsStreams.outboundGreetings();
    messageChannel.send(MessageBuilder.withPayload(greetings)
        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
        .build());
  }
}
