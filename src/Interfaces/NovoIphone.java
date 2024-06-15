package Interfaces;

public class NovoIphone implements ReprodutorMusicial, AparelhoTelefônico, NavegadorDeInternet {
    // ReprodutorMusicial
    public void tocar() {
        System.out.println("Aí maluco está tocando sua musica");
    }

    public void pausar() {
        System.out.println("O reprodutor de musica está pausado maluco");
    }

    public void selecionarMusica(String musica) {
       
        System.out.println("Selecione sua musica preferida maluco -> "+ musica);
    }

    // AparelhoTelefônico
    public void ligar() {
        System.out.println("Seu telefone esta ligando...");
    }

    public void atender() {
        System.out.println("Atenda seu telefone para completar a chamada");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Pronto... diga algo para iniciar a conversa");
    }

    // NavegadorDeInternet
    public void exibirPagina(String url) {
        System.out.println("Sua Página de web está aberta..." + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova Página");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
