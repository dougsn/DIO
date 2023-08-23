package list.Ordenacao.Exercicio;

public class NumeroInteiro implements Comparable<NumeroInteiro>{
    private int numero;

    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "NumeroInteiro{" +
                "numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(NumeroInteiro n) {
        return Integer.compare(numero, n.numero);
    }
}