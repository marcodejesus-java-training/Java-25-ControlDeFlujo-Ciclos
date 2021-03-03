import javax.crypto.spec.PSource;
import javax.sound.midi.spi.SoundbankReader;
import java.util.*;

public class Main {
    public static void main(String args[]){

        final int NUMERO_DE_VUELTAS_EN_EL_CIRCUITO = 5;
        int contadorDeVueltas = 1;

        // Ciclo While (Mientras)
        while(contadorDeVueltas < NUMERO_DE_VUELTAS_EN_EL_CIRCUITO){
            System.out.println("Vuleta #" + contadorDeVueltas);
            contadorDeVueltas++;
        }

        System.out.println("Carrera terminada!");
        System.out.println();

        contadorDeVueltas = 1;

        // Ciclo Do-While (Hacer-Mientras)
        do {
            System.out.println("Vuleta #" + contadorDeVueltas);
            contadorDeVueltas++;
        }while(contadorDeVueltas < NUMERO_DE_VUELTAS_EN_EL_CIRCUITO);

        System.out.println("Carrera terminada!");
        System.out.println();

        // Ciclo For
        for(int contador = 1; contador <= NUMERO_DE_VUELTAS_EN_EL_CIRCUITO; contador++){
            System.out.println("Vuleta #" + contador);
            contadorDeVueltas++;
        }
        System.out.println("Carrera terminada!");
        System.out.println();

        String avengers[] = {"Iron Man", "Black Widow", "Thor", "Hulk"};

        // Ciclo For-Each
        for(String avenger : avengers){
            System.out.println(avenger + " presente!");
        }
        System.out.println();

        for (int i = 0; i < avengers.length; i++) {
            System.out.println(avengers[i] + " presente de nuevo!");
        }
        System.out.println();

        // Nuevas funcionalidades en Java 8
        // Recorrer un arreglo con el ciclo forEach en expresión lambda
        Arrays.stream(avengers).forEach(avenger -> System.out.println(avenger + " presente desde una lambda en Arreglo!"));
        System.out.println();

        // Recorrer una Lista con el ciclo forEach en expresión lambda
        List<String> avengersEnLista = Arrays.asList(avengers);
        avengersEnLista.forEach(avenger -> System.out.println(avenger + " presente desde una lambda en Lista"));
        System.out.println();

        // Recorrer un HashMap con el ciclo forEach en expresión lambda
        Map<Integer, String> mapaAvengers = new HashMap<>();
        mapaAvengers.put(1, avengers[0]);
        mapaAvengers.put(2, avengers[2]);

        mapaAvengers.forEach((clave, valor) -> System.out.println( clave + " " + valor));
    }
}
