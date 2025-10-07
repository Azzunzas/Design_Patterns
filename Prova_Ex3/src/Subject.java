public interface Subject {
    void subscribe(String topico, Observer observer);
    void unsubscribe(String topico, Observer observer);
    void notifyObservers(Noticia noticia);
}
