package pe.isil.serviciofinal.raza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("")
public class RazaController {
    @Autowired
    private RestTemplate restTemplate;

    private static String url = "https://dog.ceo/api/breeds/list";

    @GetMapping
    @RequestMapping("/api/v1/perros/razas")
    public Object getRazas() {
        ApiResponse response = restTemplate.getForObject(url, ApiResponse.class);
        return response;
    }
}
