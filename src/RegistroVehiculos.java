import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        if (!coches.contains(coche)){
            coches.add(coche);
            System.out.println("Coche creado");
        }
        else{
            System.out.println("Error, el coche ya existe.");
        }

    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Optional<Coche> obtenerVehiculo(String matricula) {
        Coche r = null;
        for (Coche c: coches){
            if (c.getMatricula().equals(matricula)){
                r = c;
            }
        }
        if (r != null){
            return Optional.ofNullable(r);
        }
        else {
            return null;
        }
    }

    public void eliminarVehiculo(String matricula) {
        Coche a = null;
        for (Coche c: coches){
            if (c.getMatricula().equals(matricula)){
                a = c;
            }
        }
        coches.remove(a);
    }

    public Optional<Coche> obtenerVehiculoPrecioMax() {
        return Optional.ofNullable(Collections.max(coches, Comparator.comparing(Coche::getPrecio)));
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        return coches.stream().filter(coche -> coche.getMarca().equals(marca)).collect(Collectors.toList());
    }

    public List<Coche> obtenerTodos() {
        return new ArrayList<Coche>(coches);
    }
}
