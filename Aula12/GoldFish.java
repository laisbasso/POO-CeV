package aula12;
public class GoldFish extends Peixe {

    public GoldFish(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String toString() {
        return "GoldFish{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor das escamas=" + this.getCorEscama() + '}';
    }
}
