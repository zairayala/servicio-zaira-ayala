package pe.isil.serviciofinal.pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("")
public class PokemonController {

    @Autowired
    private RestTemplate restTemplate;
    private static String urlPokemon="https://pokeapi.co/api/v2/pokemon/{1}";


    @GetMapping
    @RequestMapping("/api/v1/pokemon/get-all")
    public List<PokemonResponse> obtenerPokemons() {

        PokemonResponse objeto;
        List<PokemonResponse> objects = new ArrayList<>();

        for(int i=1;i<=20;i++){
            objeto = restTemplate.getForObject(urlPokemon,PokemonResponse.class,i);
            objects.add(objeto);
        }
        return objects;
    }
}
