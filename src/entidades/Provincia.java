package entidades;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@SuperBuilder
@Data
@ToString(exclude = "pais")

public class Provincia {
    private Long id;
    private String nombre;
    private Pais pais;

    @Builder.Default
    private Set<Localidad> localidades = new HashSet<>();


}
