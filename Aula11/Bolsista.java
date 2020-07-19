package aula11;
public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada com sucesso!");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagamento facilitado para bolsista.");
    }
}
