package com.github.sroigmas.spring.cloud.stream.kafka.custom.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Greetings {

  private long timestamp;
  private String message;
}
