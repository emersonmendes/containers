package br.com.emersonmendes.containers.controller;

import br.com.emersonmendes.containers.dto.MessageDTO;
import br.com.emersonmendes.containers.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(method= POST)
    public ResponseEntity<Void> sendMessage(@RequestBody MessageDTO message) throws Exception {
        messageService.sendMessage(message);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
