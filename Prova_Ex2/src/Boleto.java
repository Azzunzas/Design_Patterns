public class Boleto implements FormaDePagamento{

    @Override
    public void pagar() {
        System.out.println("Selecionado Boleto Bancário");
    }
}
