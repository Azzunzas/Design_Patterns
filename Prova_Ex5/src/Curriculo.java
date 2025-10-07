public class Curriculo implements Prototype{
    private String nomeCandidato;
    private String secoesEstruturais;

    private String cor;
    private String fonte;
    private String logo;

    public Curriculo(String nomeCandidato, String secoes) {
        this.nomeCandidato = nomeCandidato;
        this.secoesEstruturais = secoes;

        this.cor = "Azul";
        this.fonte = "Arial";
        this.logo = "Logo";
    }
    private Curriculo(Curriculo curriculoClonar){
        this.nomeCandidato = curriculoClonar.nomeCandidato;
        this.secoesEstruturais = curriculoClonar.secoesEstruturais;
        this.cor = curriculoClonar.cor;
        this.fonte = curriculoClonar.fonte;
        this.logo = curriculoClonar.logo;
    }
    @Override
    public Prototype clone(){
        return new Curriculo(this);
    }
    @Override
    public void personalizar(String cor, String fonte, String logo){
        this.cor = cor;
        this. fonte = fonte;
        this.logo = logo;
    }
    @Override
    public void exibir(){
        System.out.println("curriculo");
        System.out.println("Candidato: " + nomeCandidato);
        System.out.println("Estrutura: " + secoesEstruturais);
        System.out.println("Estilo: "+ cor + "fonte: " + fonte + " logo: " + logo);
        System.out.println("==========================");
    }
}
