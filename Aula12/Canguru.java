package aula12;
public class Canguru extends Mamifero {
    
    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public String toString() {
        return "Canguru{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor do pelo=" + this.getCorPelo() + '}';
    }
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");     
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
