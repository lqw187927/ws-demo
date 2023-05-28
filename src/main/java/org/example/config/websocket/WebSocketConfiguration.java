package org.example.config.websocket;

import lombok.NonNull;
import org.example.config.websocket.MyWebSocketHandler;
import org.example.interceptor.WebSocketInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @Author luqiwei
 * @Date 2023/5/11 13:24
 */
//@Configuration
//@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {
    @Bean
    public MyWebSocketHandler defaultWebSocketHandler() {
        return new MyWebSocketHandler();
    }

    @Bean
    public WebSocketInterceptor webSocketInterceptor() {
        return new WebSocketInterceptor();
    }

    @Override
    public void registerWebSocketHandlers(@NonNull WebSocketHandlerRegistry registry) {
//        registry.addHandler(defaultWebSocketHandler(), "ws/message")
//                .addInterceptors(webSocketInterceptor())
//                .setAllowedOrigins("*");
    }
}
