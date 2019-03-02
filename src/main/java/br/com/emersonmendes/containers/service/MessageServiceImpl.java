package br.com.emersonmendes.containers.service;

import br.com.emersonmendes.containers.dto.MessageDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    private static final String TOPIC_EXCHANGE_NAME = "containers-exchange";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendMessage(MessageDTO message) {
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "route.something.containers", message.getBody());
    }

}
