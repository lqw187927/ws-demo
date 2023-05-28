package org.example.core;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.messaging.SubProtocolWebSocketHandler;

@Slf4j
public class CustomWebSocketHandler extends SubProtocolWebSocketHandler {

    @Autowired
    private WebSocketSessionHandler webSocketSessionHandler;

    /**
     * Create a new {@code SubProtocolWebSocketHandler} for the given inbound and outbound channels.
     *
     * @param clientInboundChannel  the inbound {@code MessageChannel}
     * @param clientOutboundChannel the outbound {@code MessageChannel}
     */
    public CustomWebSocketHandler(MessageChannel clientInboundChannel, SubscribableChannel clientOutboundChannel) {
        super(clientInboundChannel, clientOutboundChannel);
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("建立连接");
        webSocketSessionHandler.register(session);
        super.afterConnectionEstablished(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        log.info("释放连接");
        webSocketSessionHandler.release(session);
        super.afterConnectionClosed(session, closeStatus);
    }
}
