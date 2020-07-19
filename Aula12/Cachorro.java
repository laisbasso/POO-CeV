package aula12;
public class Cachorro extends Mamifero{

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    @Override
    public String toString() {
        return "Cachorro{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor do pelo=" + this.getCorPelo() + '}';
    }    
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
}
