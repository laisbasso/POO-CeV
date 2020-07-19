package aula12;
public class Arara extends Ave {

    public Arara(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    @Override
    public String toString() {
        return "Arara{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor das penas=" + this.getCorPena() + '}';
    }
}
