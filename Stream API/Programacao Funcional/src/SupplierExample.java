import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)")
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }


}
