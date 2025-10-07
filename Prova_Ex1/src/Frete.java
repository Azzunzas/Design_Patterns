public class Frete {
    protected double priceProduct; // PREÇO DO PRODUTO
    protected int days; // DIAS PARA A ENTREGA

    public Frete(){
    }

    public Frete(double priceProduct, int days){
        this.days = days;
        this.priceProduct = priceProduct;
    }

    public double CalcularFrete(){
        return this.priceProduct * this.days;
    }
}
