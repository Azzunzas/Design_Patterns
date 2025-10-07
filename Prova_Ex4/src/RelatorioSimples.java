public class RelatorioSimples implements Relatorio{

    @Override
    public String gerar(){
        return "Relatório Básico: [Lista de Pedidos do Dia]\n";
    }
}
