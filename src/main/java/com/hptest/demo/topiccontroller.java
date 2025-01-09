package com.hptest.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topiccontroller {
    @RequestMapping("/topics")
    public List<topic> getAlltopics() {
        return Arrays.asList(
                new topic("spring", "Spring Framework", "Spring Framework Description"),
                new topic("java", "Core Java", "Core Java Description"),
                new topic("javascript", "JavaScript", "JavaScript Description"));
    }
}
