/**
 * La clase Jugador representa a un jugador en el campeonato.
 */
public class Jugador {
    
    protected String nombre;                // Nombre del jugador
    protected String pais;                  // País del jugador
    protected int faltas;                   // Cantidad de faltas cometidas por el jugador
    protected int golesDirectos;            // Cantidad de goles directos marcados por el jugador
    protected int totalDeLanzamientos;      // Total de lanzamientos realizados por el jugador

    /**
     * Constructor para crear un nuevo jugador.
     *
     * @param nombre Nombre del jugador.
     * @param pais País de origen del jugador.
     * @param faltas Cantidad de faltas cometidas por el jugador.
     * @param golesDirectos Cantidad de goles directos marcados por el jugador.
     * @param totalDeLanzamientos Total de lanzamientos realizados por el jugador.
     */
    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalDeLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalDeLanzamientos = totalDeLanzamientos;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jugador.
     *
     * @param nombre El nuevo nombre del jugador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el país de origen del jugador.
     *
     * @return El país de origen del jugador.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Establece el país de origen del jugador.
     *
     * @param pais El nuevo país de origen del jugador.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Obtiene la cantidad de faltas cometidas por el jugador.
     *
     * @return La cantidad de faltas cometidas por el jugador.
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * Establece la cantidad de faltas cometidas por el jugador.
     *
     * @param faltas La nueva cantidad de faltas cometidas por el jugador.
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    /**
     * Obtiene la cantidad de goles directos marcados por el jugador.
     *
     * @return La cantidad de goles directos marcados por el jugador.
     */
    public int getGolesDirectos() {
        return golesDirectos;
    }

    /**
     * Establece la cantidad de goles directos marcados por el jugador.
     *
     * @param golesDirectos La nueva cantidad de goles directos marcados por el jugador.
     */
    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }

    /**
     * Obtiene el total de lanzamientos realizados por el jugador.
     *
     * @return El total de lanzamientos realizados por el jugador.
     */
    public int getTotalDeLanzamientos() {
        return totalDeLanzamientos;
    }

    /**
     * Establece el total de lanzamientos realizados por el jugador.
     *
     * @param totalDeLanzamientos El nuevo total de lanzamientos realizados por el jugador.
     */
    public void setTotalDeLanzamientos(int totalDeLanzamientos) {
        this.totalDeLanzamientos = totalDeLanzamientos;
    }

    /**
     * Devuelve una representación en cadena del jugador.
     *
     * @return Una cadena que representa al jugador.
     */
    @Override
    public String toString() {
        return "Nombre del Jugador: " + nombre + ", País: " + pais + ", Faltas: " + faltas + ", Goles Directos: "
                + golesDirectos + ", Total de Lanzamientos: " + totalDeLanzamientos;
    }

    /**
     * Calcula la efectividad del jugador.
     *
     * @return La efectividad del jugador (este método se sobrescribirá en las clases derivadas).
     */
    public double calcularEfectividad() {
        return 0.0; // Este método se sobrescribirá en las clases derivadas
    }
}
