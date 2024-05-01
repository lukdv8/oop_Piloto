//classe instanciável
public class Piloto{
    //atributos da classe
    private String nome;
    private int horasVoo;

    //construtor
    public Piloto(String nome){
        this.horasVoo = 0;
        this.nome = "Lucas";
        setNome(nome);
    }
    //método setter do atributo nome
    public void setNome(String nome){
        if(nome !=null && !nome.isEmpty()){
            this.nome = nome;
        }
    }
    //método getter do nome
    public String getNome(){
        return nome;
    }
    //método que adiciona horas de voo
    public void adcHorasVoo(int horas){
        this.horasVoo +=horas;
    }
    //método executado na main
    public void status(){
        System.out.println("Piloto "+nome+", horas de voo: "+horasVoo);
        String tipo;
        if(horasVoo < 200){
            tipo = "Co-piloto";
        }else{
            tipo = "Comandante";
        }
        System.out.println("Função: "+tipo);
    }
}