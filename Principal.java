/**
 * Clase principal cuenta con el metodo main del programa y es la encargada de solo imprimir y recibir datos del usuario.
 *
 * @author Javier Alexander Linares Chang - carnet 231135
 * @version 1.0
 * @since 2023-09-24
 */

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar menú
            System.out.println("------------------------------Menú:------------------------------");
            System.out.println("1. Agregar Portero");
            System.out.println("2. Agregar Extremo");
            System.out.println("3. Mostrar todos los jugadores registrados en el campeonato");
            System.out.println("4. Los 3 mejores porteros en función de su efectividad");
            System.out.println("5. La cantidad de extremos con más de un 85% de efectividad");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea después del número
            System.out.println("-----------------------------------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.println("--------------------Seleccionaste: Agregar Portero--------------------");

                    // Solicitar datos del portero
                    System.out.print("Nombre del portero: ");
                    String nombrePortero = scanner.nextLine();

                    System.out.print("País: ");
                    String paisPortero = scanner.nextLine();

                    System.out.print("Faltas: ");
                    int faltasPortero = scanner.nextInt();

                    System.out.print("Goles directos: ");
                    int golesDirectosPortero = scanner.nextInt();

                    System.out.print("Total de lanzamientos: ");
                    int totalLanzamientosPortero = scanner.nextInt();

                    System.out.print("Paradas efectivas: ");
                    int paradasEfectivasPortero = scanner.nextInt();

                    System.out.print("Goles recibidos: ");
                    int golesRecibidosPortero = scanner.nextInt();

                    // Crear un nuevo objeto Portero y agregarlo al campeonato
                    Portero nuevoPortero = new Portero(nombrePortero, paisPortero, faltasPortero, golesDirectosPortero, totalLanzamientosPortero, paradasEfectivasPortero, golesRecibidosPortero);
                    campeonato.agregarPortero(nuevoPortero);
                    System.out.println("Portero agregado al campeonato.");
                    break;

                case 2:
                    System.out.println("--------------------Seleccionaste: Agregar Extremo--------------------");

                    // Solicitar datos del extremo
                    System.out.print("Nombre del extremo: ");
                    String nombreExtremo = scanner.nextLine();

                    System.out.print("País: ");
                    String paisExtremo = scanner.nextLine();

                    System.out.print("Faltas: ");
                    int faltasExtremo = scanner.nextInt();

                    System.out.print("Goles directos: ");
                    int golesDirectosExtremo = scanner.nextInt();

                    System.out.print("Total de lanzamientos: ");
                    int totalLanzamientosExtremo = scanner.nextInt();

                    System.out.print("Pases: ");
                    int pasesExtremo = scanner.nextInt();

                    System.out.print("Asistencias efectivas: ");
                    int asistenciasEfectivasExtremo = scanner.nextInt();

                    // Crear un nuevo objeto Extremo y agregarlo al campeonato
                    Extremo nuevoExtremo = new Extremo(nombreExtremo, paisExtremo, faltasExtremo, golesDirectosExtremo, totalLanzamientosExtremo, pasesExtremo, asistenciasEfectivasExtremo);
                    campeonato.agregarExtremo(nuevoExtremo);
                    System.out.println("Extremo agregado al campeonato.");
                    break;
                case 3:
                    System.out.println("--Seleccionaste: Mostrar todos los jugadores registrados en el campeonato--");
                    campeonato.mostrarTodosLosJugadores();
                    break;
                case 4:
                    System.out.println("Seleccionaste: Los 3 mejores porteros en función de su efectividad");
                    List<Portero> mejoresPorteros = campeonato.tresMejoresPorteros();
                    for (int i = 0; i < mejoresPorteros.size(); i++) {
                        System.out.println("Mejor portero #" + (i + 1) + ":");
                        System.out.println(mejoresPorteros.get(i));
                    }
                    break;
                case 5:
                    System.out.println("--Seleccionaste: La cantidad de extremos con más de un 85% de efectividad--");
                    int cantidadExtremosCon85 = campeonato.cantidadExtremosCon85Efectividad();
                    System.out.println("Cantidad de extremos con más de un 85% de efectividad: " + cantidadExtremosCon85);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
        }
    }
}