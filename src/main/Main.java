package src.main;

import src.iphone.Iphone;

import src.interfaces.ReprodutorMusical;

import src.interfaces.AparelhoTelefonico;

import src.interfaces.NavegadorInternet;

public class Main {
    public static void main(String[] args) {
        
        // Criei um objeto Iphone para teste
        Iphone meuIphone = new Iphone("iPhone 14", "iOS", 128);

        // Vou testar os métodos
        meuIphone.tocar();
        meuIphone.selecionarMusica("Karma Police");
        meuIphone.pausar();
        
        meuIphone.ligar("984372346");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        meuIphone.exibirPagina("DIO.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}