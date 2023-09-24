import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * La clase Campeonato representa un campeonato que contiene listas de porteros y extremos.
 */
public class Campeonato {
    private ArrayList<Portero> porteros;  // Lista de porteros
    private ArrayList<Extremo> extremos;  // Lista de extremos

    /**
     * Constructor para crear un nuevo campeonato con listas vacías de porteros y extremos.
     */
    public Campeonato() {
        porteros = new ArrayList<>();
        extremos = new ArrayList<>();
    }

    /**
     * Agrega un portero a la lista de porteros del campeonato.
     *
     * @param portero El portero que se va a agregar.
     */
    public void agregarPortero(Portero portero) {
        porteros.add(portero);
    }

    /**
     * Agrega un extremo a la lista de extremos del campeonato.
     *
     * @param extremo El extremo que se va a agregar.
     */
    public void agregarExtremo(Extremo extremo) {
        extremos.add(extremo);
    }

    /**
     * Muestra en la consola todos los jugadores registrados en el campeonato,
     * incluyendo tanto porteros como extremos.
     */
    public void mostrarTodosLosJugadores() {
        System.out.println("Porteros:");
        for (Portero portero : porteros) {
            System.out.println(portero);
        }

        System.out.println("\nExtremos:");
        for (Extremo extremo : extremos) {
            System.out.println(extremo);
        }
    }

    /**
     * Obtiene una lista con los tres mejores porteros en función de su efectividad.
     *
     * @return Una lista con los tres mejores porteros.
     */
    public List<Portero> tresMejoresPorteros() {
        // Ordenar la lista de porteros en función de su efectividad
        Collections.sort(porteros, new Comparator<Portero>() {
            @Override
            public int compare(Portero p1, Portero p2) {
                // Orden descendente: del mayor efectividad al menor
                return Double.compare(p2.calcularEfectividad(), p1.calcularEfectividad());
            }
        });

        // Tomar los primeros 3 porteros (los mejores)
        int numPorteros = Math.min(3, porteros.size());
        return porteros.subList(0, numPorteros);
    }

    /**
     * Calcula la cantidad de extremos con más de un 85% de efectividad.
     *
     * @return La cantidad de extremos con efectividad superior al 85%.
     */
    public int cantidadExtremosCon85Efectividad() {
        int count = 0;
        for (Extremo extremo : extremos) {
            if (extremo.calcularEfectividad() > 85.0) {
                count++;
            }
        }
        return count;
    }
}