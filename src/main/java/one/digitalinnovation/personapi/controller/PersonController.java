package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //controlador acessado através da API
@RequestMapping("/api/v1/people") // path principal para acesso da API (nivel 1 de Richardson)
public class PersonController {

    //mapeando o primeiro método
    @GetMapping
    public String getBook() {
        return "API Rest";
    }
}
