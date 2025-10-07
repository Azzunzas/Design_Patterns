import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SiteDeNoticias implements Subject {
    // Agora, um Mapa para organizar os assinantes por tópico
    private Map<String, List<Observer>> observersPorTopico = new HashMap<>();

    @Override
    public void subscribe(String topico, Observer observer) {
        // Usa computeIfAbsent para obter a lista do tópico. Se o tópico não existir, cria uma nova lista.
        this.observersPorTopico.computeIfAbsent(topico, k -> new ArrayList<>()).add(observer);
        System.out.println("-> " + ((AssinanteDeNoticias)observer).getNome() + " se inscreveu no tópico: " + topico);
    }

    @Override
    public void unsubscribe(String topico, Observer observer) {
        if (this.observersPorTopico.containsKey(topico)) {
            this.observersPorTopico.get(topico).remove(observer);
            System.out.println("-> " + ((AssinanteDeNoticias)observer).getNome() + " cancelou a inscrição no tópico: " + topico);
        }
    }

    @Override
    public void notifyObservers(Noticia noticia) {
        String topico = noticia.topico();
        // Verifica se existe alguém inscrito neste tópico
        if (this.observersPorTopico.containsKey(topico)) {
            // Pega a lista de assinantes específica daquele tópico
            List<Observer> subscribers = this.observersPorTopico.get(topico);
            // Notifica apenas eles
            for (Observer observer : subscribers) {
                observer.update(noticia);
            }
        }
    }

    // Metodo de negócio para publicar uma nova notícia
    public void publicarNoticia(Noticia noticia) {
        System.out.println("\n[AGÊNCIA] Publicando notícia de [" + noticia.topico() + "]: \"" + noticia.titulo() + "\"");
        this.notifyObservers(noticia);
    }
}