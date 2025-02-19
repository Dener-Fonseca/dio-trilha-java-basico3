Projeto iPhone - DIO

Este projeto foi desenvolvido como parte do meu aprendizado de Java, focando no uso de pacotes, classes, interfaces e implementações.

Descrição

O projeto simula um iPhone com três funcionalidades principais:

ReprodutorMusical: Para tocar e pausar músicas.

AparelhoTelefonico: Para realizar e atender chamadas.

NavegadorInternet: Para navegar na internet.


Estrutura do Projeto

Classe Main: Cria um objeto iPhone e testa os métodos.

Classe iPhone: Implementa as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.


Como Rodar

1. Clone o repositório:

git clone <url-do-repositorio>


2. Compile e execute a classe Main para testar as funcionalidades.



Exemplo de Código

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        meuIphone.ligar();
        meuIphone.tocarMusica();
        meuIphone.navegarNaInternet();
    }
}

Tecnologias

Java

Interfaces e Implementações
