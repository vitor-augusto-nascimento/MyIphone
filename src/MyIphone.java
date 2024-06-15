import Interfaces.NovoIphone;

public class MyIphone {
    public static void main(String[] args) throws Exception{
      NovoIphone meuIphone = new NovoIphone();
      meuIphone.tocar();
      meuIphone.pausar();
      meuIphone.selecionarMusica(" Minha Musica");
      meuIphone.ligar();
      meuIphone.atender();
      meuIphone.iniciarCorrerioVoz();
      meuIphone.exibirPagina("https:minhapagina.net");
      meuIphone.adicionarNovaAba();
      meuIphone.atualizarPagina();
     
    }
}