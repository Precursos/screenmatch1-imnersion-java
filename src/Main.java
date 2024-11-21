import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1997;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBase = true;
        String nombre = "Matrix";
        String sinopsis = """
               La mejor pelicula del fin del milenio
               NO MAMES
               NO SABIA QUE SE PODIA HACER
               ESTOOOOOOOO
               """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBase);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion: " + mediaEvaluacion);

        if (fechaDeLanzamiento <= 2023){
            System.out.println("pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("incgresa la nota que le darias a Matrix:");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la pelicula es: " + mediaEvaluacion / 3);

        }
}
