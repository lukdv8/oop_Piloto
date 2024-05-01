//funcao principal
public class Prog {
    public static void main (String []args){
        //instanciando objeto Piloto
        Piloto p1 = new Piloto("Mark");
        Piloto p2 = new Piloto("George");

        //incrementa horas de voo ao objeto instanciado
        p1.adcHorasVoo(200);
        p2.adcHorasVoo(199);

        //exibe informacoes dos objetos instanciados
        p1.status();
        p2.status();
    }
}
