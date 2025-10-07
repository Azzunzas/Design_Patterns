// AssinanteDeNoticias.java
public class AssinanteDeNoticias implements Observer {
    private String nome;

    public AssinanteDeNoticias(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void update(Noticia noticia) {
        System.out.println(">> [" + this.nome + "] recebeu a notícia de [" + noticia.topico() + "]: \"" + noticia.titulo() + "\"");
    }
}