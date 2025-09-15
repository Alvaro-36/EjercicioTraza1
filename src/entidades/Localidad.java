package entidades;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Data
@SuperBuilder
@ToString(exclude = "provincia")
public class Localidad {
    private Long id;
    private String nombre;
    private Provincia provincia;

}
