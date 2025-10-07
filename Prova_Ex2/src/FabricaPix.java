public class FabricaPix implements FabricaForma {

    @Override
    public FormaDePagamento CriarForma(){
        return new Pix();
    }
}
