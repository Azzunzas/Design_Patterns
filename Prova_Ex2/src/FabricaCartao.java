public class FabricaCartao implements FabricaForma{

    @Override
    public FormaDePagamento CriarForma(){
        return new CreditCard();
    }
}
