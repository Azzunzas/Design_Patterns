public interface Prototype {

    Prototype clone();
    void personalizar(String cor, String fonte, String logo);
    void exibir();
}
