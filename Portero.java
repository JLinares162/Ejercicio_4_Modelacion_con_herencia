/**
 * La clase Portero representa a un portero en el campeonato, que es un tipo de jugador.
 */
public class Portero extends Jugador {
    
    private int paradasEfectivas;    // Cantidad de paradas efectivas realizadas por el portero
    private int golesRecibidos;      // Cantidad de goles recibidos por el portero

    /**
     * Constructor para crear un nuevo portero.
     *
     * @param nombre Nombre del portero.
     * @param pais País de origen del portero.
     * @param faltas Cantidad de faltas cometidas por el portero.
     * @param golesDirectos Cantidad de goles directos marcados por el portero.
     * @param totalDeLanzamientos Total de lanzamientos realizados por el portero.
     * @param paradasEfectivas Cantidad de paradas efectivas realizadas por el portero.
     * @param golesRecibidos Cantidad de goles recibidos por el portero.
     */
    public Portero(String nombre, String pais, int faltas, int golesDirectos, int totalDeLanzamientos,
            int paradasEfectivas, int golesRecibidos) {
        super(nombre, pais, faltas, golesDirectos, totalDeLanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
    }

    /**
     * Obtiene la cantidad de paradas efectivas realizadas por el portero.
     *
     * @return La cantidad de paradas efectivas realizadas por el portero.
     */
    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    /**
     * Establece la cantidad de paradas efectivas realizadas por el portero.
     *
     * @param paradasEfectivas La nueva cantidad de paradas efectivas realizadas por el portero.
     */
    public void setParadasEfectivas(int paradasEfectivas) {
        this.paradasEfectivas = paradasEfectivas;
    }

    /**
     * Obtiene la cantidad de goles recibidos por el portero.
     *
     * @return La cantidad de goles recibidos por el portero.
     */
    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    /**
     * Establece la cantidad de goles recibidos por el portero.
     *
     * @param golesRecibidos La nueva cantidad de goles recibidos por el portero.
     */
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    /**
     * Devuelve una representación en cadena del portero, incluyendo los atributos heredados de Jugador.
     *
     * @return Una cadena que representa al portero.
     */
    @Override
    public String toString() {
        return super.toString() + ", Paradas Efectivas: " + paradasEfectivas + ", Goles Recibidos: " + golesRecibidos;
    }

    /**
     * Calcula la efectividad del portero utilizando la fórmula especificada.
     *
     * @return La efectividad del portero.
     */
    @Override
    public double calcularEfectividad() {
        if (getTotalDeLanzamientos() == 0) {
            return 0.0;
        }
        return ((paradasEfectivas - golesRecibidos) * 100.0 / (paradasEfectivas + golesRecibidos)) + (getGolesDirectos() * 100.0 / getTotalDeLanzamientos());
    }
}