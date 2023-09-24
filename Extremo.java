/**
 * La clase Extremo representa a un extremo en el campeonato, que es un tipo de jugador.
 */
public class Extremo extends Jugador {
     
    private int pases;                   // Cantidad de pases realizados por el extremo
    private int asistenciasEfectivas;    // Cantidad de asistencias efectivas realizadas por el extremo

    /**
     * Constructor para crear un nuevo extremo.
     *
     * @param nombre Nombre del extremo.
     * @param pais País de origen del extremo.
     * @param faltas Cantidad de faltas cometidas por el extremo.
     * @param golesDirectos Cantidad de goles directos marcados por el extremo.
     * @param totalDeLanzamientos Total de lanzamientos realizados por el extremo.
     * @param pases Cantidad de pases realizados por el extremo.
     * @param asistenciasEfectivas Cantidad de asistencias efectivas realizadas por el extremo.
     */
    public Extremo(String nombre, String pais, int faltas, int golesDirectos, int totalDeLanzamientos, int pases,
            int asistenciasEfectivas) {
        super(nombre, pais, faltas, golesDirectos, totalDeLanzamientos);
        this.pases = pases;
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    /**
     * Obtiene la cantidad de pases realizados por el extremo.
     *
     * @return La cantidad de pases realizados por el extremo.
     */
    public int getPases() {
        return pases;
    }

    /**
     * Establece la cantidad de pases realizados por el extremo.
     *
     * @param pases La nueva cantidad de pases realizados por el extremo.
     */
    public void setPases(int pases) {
        this.pases = pases;
    }

    /**
     * Obtiene la cantidad de asistencias efectivas realizadas por el extremo.
     *
     * @return La cantidad de asistencias efectivas realizadas por el extremo.
     */
    public int getAsistenciasEfectivas() {
        return asistenciasEfectivas;
    }

    /**
     * Establece la cantidad de asistencias efectivas realizadas por el extremo.
     *
     * @param asistenciasEfectivas La nueva cantidad de asistencias efectivas realizadas por el extremo.
     */
    public void setAsistenciasEfectivas(int asistenciasEfectivas) {
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    /**
     * Devuelve una representación en cadena del extremo, incluyendo los atributos heredados de Jugador.
     *
     * @return Una cadena que representa al extremo.
     */
    @Override
    public String toString() {
        return super.toString() + ", Pases: " + pases + ", Asistencias Efectivas: " + asistenciasEfectivas;
    }

    /**
     * Calcula la efectividad del extremo utilizando la fórmula especificada.
     *
     * @return La efectividad del extremo.
     */
    @Override
    public double calcularEfectividad() {
        if (getTotalDeLanzamientos() == 0) {
            return 0.0;
        }
        return ((pases + asistenciasEfectivas - getFaltas()) * 100.0 / (pases + asistenciasEfectivas + getFaltas())) + (getGolesDirectos() * 100.0 / getTotalDeLanzamientos());
    }
}
