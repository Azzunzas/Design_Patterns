public class RelatorioComEstatisticas extends RelatorioDecorator{

    public RelatorioComEstatisticas(Relatorio relatorio){
        super(relatorio);

    }
    @Override
    public String gerar(){
        String relatorioBase = super.gerar();
        String estatisticas = adicionarEstatisticas();
        return  relatorioBase + estatisticas;
    }

    private String adicionarEstatisticas(){
        return  " Adicional de Estatísticas: [Faturamento total: R$ 5,00]\n";
    }

}
