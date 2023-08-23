package list.Ordenacao.Exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<NumeroInteiro> numeroInteiroList;

    public OrdenacaoNumeros() {
        this.numeroInteiroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroInteiroList.add(new NumeroInteiro(numero));
    }

    public List<NumeroInteiro> ordenarAscendente() {
        List<NumeroInteiro> numerosAscendentes = new ArrayList<>(numeroInteiroList);

        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<NumeroInteiro> ordenarDescendente() {
        List<NumeroInteiro> numerosDescendentes = new ArrayList<>(numeroInteiroList);

        numerosDescendentes.sort(Collections.reverseOrder());
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}
