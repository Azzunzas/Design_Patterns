public class FabricaBoleto implements FabricaForma
{
    @Override
    public FormaDePagamento CriarForma(){
        return new Boleto();
    }
}
