package aula12;
public class Peixe extends Animal{
    private String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
        this.setCorEscama(corEscama);
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
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
        return "Peixe{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", cor das escamas=" + corEscama + '}';
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolhas(){
        System.out.println("Soltou uma bolha");
    }
}
