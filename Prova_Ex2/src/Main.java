public class Main {

    public static void main(String[] args){

        //CRIAÇÃO DE FORMAS DE PAGAMENTO UTILIZANDO AS FABRICAS DE:

        //CARTÃO:
        FabricaForma cartaoFactory = new FabricaCartao();
        FormaDePagamento cartao = cartaoFactory.CriarForma();
        cartao.pagar();
        //PIX:
        FabricaForma pixFactory = new FabricaPix();
        FormaDePagamento pix = pixFactory.CriarForma();
        pix.pagar();
        //BOLETO:
        FabricaForma boletoFactory = new FabricaBoleto();
        FormaDePagamento boleto = boletoFactory.CriarForma();
        boleto.pagar();
    }
}
