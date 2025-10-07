public class Main {
    public static void main(String[] args){
        Relatorio relatorioBase = new RelatorioSimples();
        System.out.println("Relatorio simples");
        System.out.println(relatorioBase.gerar());

        Relatorio relatorioComEstatistica = new RelatorioComEstatisticas(relatorioBase);
        System.out.println("Relatorio com Estatistica");
        System.out.println(relatorioComEstatistica.gerar());

        Relatorio relatorioComPDF = new ExportadorPDF(relatorioBase);
        System.out.println("relatorio com pdf");
        System.out.println(relatorioComPDF.gerar());

        Relatorio relatorioCompleto = new ExportadorPDF(new RelatorioComEstatisticas(relatorioBase));
        System.out.println("Relatorio completo");
        System.out.println(relatorioCompleto.gerar());


    }
}
