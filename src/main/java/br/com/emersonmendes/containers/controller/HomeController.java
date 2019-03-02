package br.com.emersonmendes.containers.controller;

import br.com.emersonmendes.containers.dto.MessageDTO;
import br.com.emersonmendes.containers.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController("/")
public class HomeController {

    @RequestMapping(method= GET)
    public String welcome(){
        return "Welcome :)";
    }

}
