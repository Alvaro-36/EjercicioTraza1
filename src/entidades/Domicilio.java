package entidades;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(exclude = "sucursal")
public class Domicilio {
    private Long id;
    private String calle;
    private Integer numero;
    private Integer cp;

    private Localidad localidad;
}
