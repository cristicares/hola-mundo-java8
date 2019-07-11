package cl.cristicares.playa.holamundojava.controller;

import cl.cristicares.playa.holamundojava.domain.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("holi-mundi")
    public Item getHolaMundo(){
        return new Item("1", "Hola Mundo!");
    }

}
