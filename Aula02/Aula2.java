package aula2;
public class Aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Stabilo";
        c1.carga = 80;
        c1.cor = "Preta";
        c1.ponta = 0.4f;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "Bic";
        c2.cor = "Azul";
        c2.carga = 10;
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
    }

}
