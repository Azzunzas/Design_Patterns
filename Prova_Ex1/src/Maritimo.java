public class Maritimo extends Frete{

    protected double tamanho;

    @Override
    public double CalcularFrete() {
        return super.CalcularFrete() * this.tamanho;
    }
}
