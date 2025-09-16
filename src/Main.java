import entidades.Pais;
import entidades.*;
import repositorios.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Pais argentina = Pais.builder()
                .nombre("Argentina")
                .build();

        Provincia buenosAires = Provincia.builder()
                .nombre("Buenos Aires")
                .pais(argentina)
                .build();
        argentina.getProvincias().add(buenosAires);

        Localidad caba = Localidad.builder()
                .nombre("caba")
                .id(1L)
                .build();
        Domicilio domicilio1 = Domicilio.builder()
                .id(1L)
                .calle("Calle 1")
                .numero(440)
                .cp(6608)
                .localidad(caba)
                .build();

        Localidad laPlata = Localidad.builder()
                .nombre("La Plata")
                .id(1L)
                .build();
        Domicilio domicilio2 = Domicilio.builder()
                .id(1L)
                .calle("Calle 2")
                .numero(745)
                .cp(6608)
                .localidad(laPlata)
                .build();
        //
        // PROVINCIA CORDOBA
        //
        Provincia cordoba = Provincia.builder()
                .nombre("Cordoba")
                .id(1L)
                .pais(argentina)
                .build();
        argentina.getProvincias().add(cordoba);
        Localidad cordobaCapital = Localidad.builder()
                .id(1L)
                .nombre("Cordoba Capital")
                .provincia(cordoba)
                .build();
        Domicilio domicilio3 = Domicilio.builder()
                .calle("Calle1")
                .id(1L)
                .numero(112)
                .cp(6608)
                .localidad(cordobaCapital)
                .build();

        Localidad villaCarlosPaz = Localidad.builder()
                .id(1L)
                .nombre("Villa Carlos Paz")
                .provincia(cordoba)
                .build();
        Domicilio domicilio4 = Domicilio.builder()
                .calle("Calle2")
                .id(1L)
                .numero(112)
                .localidad(villaCarlosPaz)
                .build();
        Sucursal sucursal1 = Sucursal.builder()
                .nombre("Sucursal 1")
                .id(1L)
                .horarioApertura(LocalTime.of(12, 30))
                .horarioCierre(LocalTime.of(12, 30))
                .es_Casa_Matriz(true)
                .domicilio(domicilio1)
                .build();
        Sucursal sucursal2 = Sucursal.builder()
                .id(1L)
                .nombre("Sucursal 2")
                .horarioApertura(LocalTime.of(12, 30))
                .horarioCierre(LocalTime.of(12, 30))
                .es_Casa_Matriz(false)
                .domicilio(domicilio2)
                .build();
        Sucursal sucursal3 = Sucursal.builder()
                .id(1L)
                .nombre("Sucursal 3")
                .horarioApertura(LocalTime.of(12, 30))
                .horarioCierre(LocalTime.of(12, 30))
                .es_Casa_Matriz(false)
                .domicilio(domicilio3)
                .build();
        Sucursal sucursal4 = Sucursal.builder()
                .id(1L)
                .nombre("Sucursal 4")
                .horarioApertura(LocalTime.of(12, 30))
                .horarioCierre(LocalTime.of(12, 30))
                .es_Casa_Matriz(false)
                .domicilio(domicilio4)
                .build();

        // CREACION EMPRESAS

        Empresa empresa1 = Empresa.builder()
                .nombre("empresa1")
                .id(1L)
                .cuit(123456)
                .logo("logo")
                .sucursales(new HashSet<>(Set.of(sucursal1, sucursal2)))
                .build();

        Empresa empresa2 = Empresa.builder()
                .nombre("empresa2")
                .id(1L)
                .cuit(723952)
                .logo("logo2")
                .sucursales(new HashSet<>(Set.of(sucursal3, sucursal4)))
                .build();

        sucursal1.setEmpresa(empresa1);
        sucursal2.setEmpresa(empresa1);
        sucursal3.setEmpresa(empresa2);
        sucursal4.setEmpresa(empresa2);


    }
}