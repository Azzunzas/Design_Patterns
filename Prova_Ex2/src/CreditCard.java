public class CreditCard implements FormaDePagamento{

    @Override
    public void pagar() {
        System.out.println("Selecionado Cartão de Crédito");
    }
}
