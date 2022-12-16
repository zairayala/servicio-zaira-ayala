package pe.isil.serviciofinal;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class PokemonResponse {
    private String name;
    private String height;
    private String weight;
    private String base_experience;
}
