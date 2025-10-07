public class PropostaComercial implements Prototype {

    private String nomeEmpresa;
    private String propostas;

    private String cor;
    private String fonte;
    private String logo;

    public PropostaComercial(String nomeEmpresa, String propostas){
        this.nomeEmpresa = nomeEmpresa;
        this.propostas = propostas;

        this.cor = "verde";
        this.fonte = " new times roman";
        this.logo = "LogoProposta";
    }
    private PropostaComercial(PropostaComercial propostaClonar){
        this.nomeEmpresa = propostaClonar.nomeEmpresa;
        this.propostas = propostaClonar.propostas;
        this.cor = propostaClonar.cor;
        this.fonte = propostaClonar.fonte;
        this.logo = propostaClonar.logo;
    }
    @Override
    public Prototype clone(){
        return new PropostaComercial(this);
    }
    @Override
    public void personalizar(String cor,String fonte,String logo){
        this.cor = cor;
        this.fonte = fonte;
        this.logo = logo;
    }
    @Override
    public void exibir(){
        System.out.println("Proposta Comercial");
        System.out.println("Empresa: " + nomeEmpresa);
        System.out.println("Proposta: " + propostas);
        System.out.println("Estilo: "+ cor + "fonte: " + fonte + " logo: " + logo);
        System.out.println("==========================");
    }


}
