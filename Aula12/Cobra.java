package aula12;
public class Cobra extends Reptil {

    public Cobra(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String toString() {
        return "Cobra{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor das escamas=" + this.getCorEscama() + '}';
    }    
}
