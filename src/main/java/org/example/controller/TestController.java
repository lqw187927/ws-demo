package org.example.controller;

import org.example.service.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author luqiwei
 * @Date 2023/5/11 13:39
 */
@RestController
public class TestController {

    @Autowired
    private WebSocket webSocket;

    @RequestMapping("/send")
    public void send(@RequestParam String userId, @RequestParam String message) throws IOException {
        webSocket.sendMessage(userId, message);
    }
}
