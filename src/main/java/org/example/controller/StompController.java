package org.example.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luqiwei
 * @Date 2023/5/16 9:29
 */
@Controller
public class StompController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String greeting(String message) {
        return "reply: " + message;
    }

    @RequestMapping("/http/hello")
    @ResponseBody
    @SendTo("/topic/greetings")
    public String httpGreeting(String message) {
        return "http-reply: " + message;
    }

}
