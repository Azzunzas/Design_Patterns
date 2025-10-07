public class Aereo extends Frete{

    protected double peso;

    @Override
    public double CalcularFrete() {
        return super.CalcularFrete() * this.peso;
    }

}
