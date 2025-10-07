public class ExportadorPDF extends RelatorioDecorator{

    public ExportadorPDF(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public String gerar(){
        String relatorioBase = super.gerar();
        String infoPdf = adicionarExportacaoPdf();
        return relatorioBase + infoPdf;
    }

    private String adicionarExportacaoPdf(){
        return "Adicional de Exportação: [Arquivo convertido para PDF]\n";
    }
}
