package org.example.config.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

/**
 * @Author luqiwei
 * @Date 2023/5/11 11:27
 */
@Slf4j
public class MyWebSocketHandler extends TextWebSocketHandler {
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        log.info("收到客户端的信息: " + message.getPayload());
        session.sendMessage(new TextMessage("收到客户端的信息：" + message.getPayload()));
    }
}
