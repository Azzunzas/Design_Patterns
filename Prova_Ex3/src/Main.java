// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando o site de noticias
        SiteDeNoticias agencia = new SiteDeNoticias();

        // assinantes
        AssinanteDeNoticias joao = new AssinanteDeNoticias("João");
        AssinanteDeNoticias maria = new AssinanteDeNoticias("Maria");
        AssinanteDeNoticias pedro = new AssinanteDeNoticias("Pedro");

        // Fazer  inscrições por tópico
        agencia.subscribe("ESPORTE", joao);
        agencia.subscribe("TECNOLOGIA", joao);

        agencia.subscribe("ESPORTE", maria);

        agencia.subscribe("GASTRONOMIA", pedro);

        // Publicar notícias de diferentes tópicos
        agencia.publicarNoticia(new Noticia("ESPORTE", "Brasil vence a Copa do Mundo!"));
        // Esperado: João e Maria recebem.

        agencia.publicarNoticia(new Noticia("GASTRONOMIA", "Novo restaurante premiado abre em Curitiba"));
        // Esperado: Apenas Pedro recebe.

        agencia.publicarNoticia(new Noticia("TECNOLOGIA", "Processadores quânticos atingem novo marco"));
        // Esperado: Apenas João recebe.

        // Agora, João não quer mais receber notícias de ESPORTE
        agencia.unsubscribe("ESPORTE", joao);

        agencia.publicarNoticia(new Noticia("ESPORTE", "Final do campeonato de basquete é hoje"));
        // Esperado: Apenas Maria recebe.
    }
}