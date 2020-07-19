package aula12;
public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Mamífero{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor do pelo=" + corPelo + '}';
    }
    
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }
}
