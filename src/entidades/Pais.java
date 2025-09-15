package entidades;

import lombok.*;
import lombok.Builder.Default;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

public class Pais {
    private Long id;
    private String nombre;

    @Builder.Default
    private Set<Provincia> provincias = new HashSet<>();
}
