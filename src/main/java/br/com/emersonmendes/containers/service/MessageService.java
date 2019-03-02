package br.com.emersonmendes.containers.service;


import br.com.emersonmendes.containers.dto.MessageDTO;
import br.com.emersonmendes.containers.model.Car;

import java.util.Set;

public interface MessageService {

    void sendMessage(MessageDTO message) throws Exception;

}
