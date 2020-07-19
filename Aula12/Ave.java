package aula12;
public class Ave extends Animal{
    private String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
        this.setCorPena(corPena);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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
        return "Ave{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor das penas=" + corPena + '}';
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
}
