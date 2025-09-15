package entidades;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Data
@ToString(exclude = "sucursales")
@SuperBuilder
public class Empresa {
    private Long id;
    private String nombre;
    private String razonSocial;
    private Integer cuit;
    private String logo;

    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();



}
