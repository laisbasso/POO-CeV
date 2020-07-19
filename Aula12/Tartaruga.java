package aula12;
public class Tartaruga extends Reptil {

    public Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String toString() {
        return "Tartaruga{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor das escamas=" + this.getCorEscama() + '}';
    }
    
    @Override
    public void locomover(){
        System.out.println("Andando beeeeem devagar");
    }
}
