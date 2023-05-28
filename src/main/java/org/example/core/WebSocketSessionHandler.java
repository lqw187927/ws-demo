package org.example.core;


import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketSession;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class WebSocketSessionHandler {
    private final Map<String, WebSocketSession> sessions = new ConcurrentHashMap<>();

    public void register(WebSocketSession webSocketSession) {
        sessions.put(webSocketSession.getPrincipal().getName(), webSocketSession);
    }
    public void release(WebSocketSession webSocketSession) {
        sessions.remove(webSocketSession.getPrincipal().getName());
    }
}
