public class Terrestre extends Frete {

    protected double km;

    @Override
    public double CalcularFrete() {
        return super.CalcularFrete() * this.km;

    }
}
