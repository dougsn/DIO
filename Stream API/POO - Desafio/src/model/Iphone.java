package model;

import interfaces.IAparelhoTelefonico;
import interfaces.INavegadorInternet;
import interfaces.IReprodutorMusical;

public class Iphone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {
    private String name;

    public Iphone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para alguém...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação de alguém...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Bummmm, exibindo a página solicitada");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Bummmm, adicionando a página solicitada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Bummmm, atualizando a página solicitada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música solicitada");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música solicitada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música solicitada");
    }
}
