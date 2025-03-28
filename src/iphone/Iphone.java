package src.iphone;

import src.interfaces.ReprodutorMusical;
import src.interfaces.AparelhoTelefonico;
import src.interfaces.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private String modelo;
    private String sistemaOperacional;
    private int armazenamento;

    public Iphone(String modelo, String sistemaOperacional, int armazenamento) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}