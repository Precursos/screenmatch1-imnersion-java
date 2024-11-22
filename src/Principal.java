import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner read = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar una nueva pelicula
                    2) Registrar una nueva serie
                    
                    9) SALIR
                    """;
            //Solo cambié la palabra "teclado" por "read"
            System.out.println(menu);
            opcion = read.nextInt();
            read.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa el nombre del titulo");
                    String nombrePelicula = read.nextLine();
                    System.out.println("Ingresa el año de lanzamiento de la pelicula");
                    int fechaDeLanzamientoPelicula = read.nextInt();
                    read.nextLine();
                    System.out.println("Ingresa la duración en minutos de la pelicula");
                    int tiempoDuracionMinutosPelicula = read.nextInt();
                    read.nextLine();

                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombrePelicula);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamientoPelicula);
                    peliculaUsuario.setTiempoDuracionMinutos(tiempoDuracionMinutosPelicula);
                    peliculaUsuario.fichaTecnica();
                    break;

                case 2:
                    System.out.println("Ingresa el nombre de la Serie");
                    String nombreSerie = read.nextLine();
                    System.out.println("Ingresa el año de lanzamiento de la Serie");
                    int fechaDeLanzamientoSerie = read.nextInt();
                    read.nextLine();
                    System.out.println("Ingresa la duración en minutos de la Serie");
                    int tiempoDuracionMinutosSerie = read.nextInt();
                    read.nextLine();

                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTiempoDuracionMinutos(tiempoDuracionMinutosSerie);
                    serieUsuario.fichaTecnica();
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        }
    }
}
