import java.util.HashMap;
import java.util.Map;

public class Main {
    // Opcional: Um "Registro de Protótipos" para guardar os modelos
    private static Map<String, Prototype > modelos = new HashMap<>();

    public static void main(String[] args) {
        // 1.  criação e armazenamento  modelos base (protótipos)
        Curriculo modeloCurriculoPadrao = new Curriculo("João da Silva (Modelo)", "Cabeçalho, Experiência Profissional, Formação Acadêmica");
        modelos.put("CURRICULO_PADRAO", modeloCurriculoPadrao);

        System.out.println(">>> Modelo Original no sistema:");
        modelos.get("CURRICULO_PADRAO").exibir();

        // 2.  currículo baseado no modelo padrão.
        // O sistema CLONA o protótipo em vez de criar um novo do zero.
        Prototype curriculoClienteA = modelos.get("CURRICULO_PADRAO").clone();

        // 3. O novo currículo "copia" é personalizado para o Cliente A.
        System.out.println(">>> Personalizando cópia para o Cliente A...");
        curriculoClienteA.personalizar("Verde Corporativo", "Roboto", "LogoClienteA.png");

        System.out.println(">>> Cópia do Cliente A (Personalizada):");
        curriculoClienteA.exibir();

        // fim = modelo original intacto!
        System.out.println(">>> Verificando o Modelo Original novamente (não foi alterado):");
        modelos.get("CURRICULO_PADRAO").exibir();

        //===================================================================
        //              relatorios
        //===================================================================

        Relatorio modeloRelatorioPadrao = new Relatorio("análise de custos", "grafico 1");
        modelos.put("Relatorio_Padrao", modeloRelatorioPadrao);

        System.out.println(">>> Modelo Original no sistema:");
        modelos.get("Relatorio_Padrao").exibir();

        // 2.  Relatorio baseado no modelo padrão.
        // O sistema CLONA o protótipo em vez de criar um novo do zero.
        Prototype relatorioClienteA = modelos.get("Relatorio_Padrao").clone();

        // 3. O novo Relatorio "copia" é personalizado para o Cliente A.
        System.out.println(">>> Personalizando cópia para o Cliente A...");
        relatorioClienteA.personalizar("Verde Corporativo", "Roboto", "LogoClienteA.png");

        System.out.println(">>> Cópia do Cliente A (Personalizada):");
        relatorioClienteA.exibir();

        // fim = modelo original intacto!
        System.out.println(">>> Verificando o Modelo Original novamente (não foi alterado):");
        modelos.get("Relatorio_Padrao").exibir();

        //===================================================================
        //              Proposta Comercial
        //===================================================================


        PropostaComercial modeloPropostaPadrao = new PropostaComercial("GuilhermeTech", "50.00 e uma coxinha");
        modelos.put("Proposta_Padrao", modeloPropostaPadrao);

        System.out.println(">>> Modelo Original no sistema:");
        modelos.get("Proposta_Padrao").exibir();

        // 2.  Relatorio baseado no modelo padrão.
        // O sistema CLONA o protótipo em vez de criar um novo do zero.
        Prototype propostaClienteA = modelos.get("Proposta_Padrao").clone();

        // 3. O novo Relatorio "copia" é personalizado para o Cliente A.
        System.out.println(">>> Personalizando cópia para o Cliente A...");
        propostaClienteA.personalizar("Vermelho manga ", "Roboto", "LogoClienteA.png");

        System.out.println(">>> Cópia do Cliente A (Personalizada):");
        propostaClienteA.exibir();

        // fim = modelo original intacto!
        System.out.println(">>> Verificando o Modelo Original novamente (não foi alterado):");
        modelos.get("Proposta_Padrao").exibir();


    }
}