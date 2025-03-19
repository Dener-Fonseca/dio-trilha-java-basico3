📱 Projeto iPhone - DIO

Este projeto foi desenvolvido como parte do meu aprendizado de Java, focando no uso de pacotes, classes, interfaces e implementações.

✨ Descrição

O projeto simula um iPhone com três funcionalidades principais:

ReprodutorMusical 🎵: Para tocar e pausar músicas.

AparelhoTelefonico 📞: Para realizar e atender chamadas.

NavegadorInternet 🌐: Para navegar na internet.


📂 Estrutura do Projeto

Classe Main: Cria um objeto iPhone e testa os métodos.

Classe iPhone: Implementa as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.


📌 Interfaces

ReprodutorMusical

tocarMusica(): Inicia a reprodução de uma música.

pausarMusica(): Pausa a música em reprodução.


AparelhoTelefonico

ligar(): Realiza uma ligação.

atender(): Atende uma ligação.


NavegadorInternet

navegarNaInternet(): Simula a navegação na web.



🚀 Como Rodar

1. Clone o repositório:

git clone <url-do-repositorio>


2. Acesse a pasta do projeto:

cd nome-do-projeto


3. Compile e execute a classe Main:

javac Main.java
java Main



📝 Exemplo de Código

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        meuIphone.ligar();
        meuIphone.tocarMusica();
        meuIphone.navegarNaInternet();
    }
}

🛠 Tecnologias Utilizadas

Java ☕

Paradigma Orientado a Objetos (POO)

Uso de Interfaces e Implementações


📌 Autor

Desenvolvido por Dener Xisto da Fonseca.

Sinta-se à vontade para contribuir ou deixar sugestões! 🚀
