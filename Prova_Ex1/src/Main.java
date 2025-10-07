public class Main {

    public static void main (String[]args){
        Aereo aereo = new Aereo();

        aereo.priceProduct = 2000.00;
        aereo.days = 1;

        //Particularidade da classe Aereo
        aereo.peso = 20.3;

        //Invocando método da classe base
        System.out.println("Valor do frete Aereo = " + aereo.CalcularFrete());

        Terrestre terra = new Terrestre();

        terra.priceProduct = 200;
        terra.days = 3;

        //da classe
        terra.km = 2.5;

        System.out.println("Valor do frete Terrestre = " + terra.CalcularFrete());

        Maritimo mar = new Maritimo();

        mar.days = 3;
        mar.priceProduct = 50000.00;
        mar.tamanho = 10.2;

        System.out.println("Valor do frete Maritimo = " + mar.CalcularFrete());

    }
}
