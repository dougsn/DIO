import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream()
                .filter(n -> n % 2 == 0) // Condição para mostrar no console.
                .forEach(System.out::println);

    }
}
