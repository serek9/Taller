import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Taller {
    private Map<Persona, Coche> reparaciones = new TreeMap<>(Comparator.comparing(Persona::getNumSS));

    public Coche registrarReparacion(Persona persona, Coche coche){
        return reparaciones.put(persona, coche);
    }

    public Coche obtenerCoche(Persona persona){
        return reparaciones.get(persona);
    }

    public Set<Persona> obtenerClientes(){
        Set<Persona> set = reparaciones.keySet();
        return set;
    }
}
