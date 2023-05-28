package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luqiwei
 * @Date 2023/5/11 13:39
 */
@RestController
public class TestController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void test() {
        messagingTemplate.convertAndSend(null);
    }
}
