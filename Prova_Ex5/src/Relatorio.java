public class Relatorio implements Prototype{

    private String tituloRelatorio;
    private String partes;

    private String cor;
    private String fonte;
    private String logo;

    public Relatorio(String tituloRelatorio, String partes){
        this.tituloRelatorio = tituloRelatorio;
        this.partes = partes;

        this.cor = "amarelo";
        this.fonte = " new times roman";
        this.logo = "Logo BI";
    }
    private Relatorio(Relatorio relatorioclonar){
        this.tituloRelatorio= relatorioclonar.tituloRelatorio;
        this.partes = relatorioclonar.partes;
        this.cor = relatorioclonar.cor;
        this.fonte = relatorioclonar.fonte;
        this.logo = relatorioclonar.logo;
    }
    @Override
    public Prototype clone(){
        return new Relatorio(this);
    }
    @Override
    public void personalizar(String cor,String fonte,String logo){
        this.cor = cor;
        this.fonte = fonte;
        this.logo = logo;
    }
    @Override
    public void exibir(){
        System.out.println("Relatorio");
        System.out.println("titulo: " + tituloRelatorio);
        System.out.println("Partes: " + partes);
        System.out.println("Estilo: "+ cor + "fonte: " + fonte + " logo: " + logo);
        System.out.println("==========================");
    }
}
