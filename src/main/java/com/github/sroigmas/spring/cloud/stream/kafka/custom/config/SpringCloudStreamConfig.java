package com.github.sroigmas.spring.cloud.stream.kafka.custom.config;

import com.github.sroigmas.spring.cloud.stream.kafka.custom.binder.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration // Optional
@EnableBinding(GreetingsStreams.class)
public class SpringCloudStreamConfig {

}
