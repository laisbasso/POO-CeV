package aula5;
public class Aula5 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(111);
        c1.setDono("Marcos");
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.sacar(150);
        c1.fecharConta();
        c1.info();
        System.out.println("-----------------------------------");
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(222);
        c2.setDono("Ana");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(1000);
        c2.info();
        System.out.println("-----------------------------------");
        
        ContaBanco c3 = new ContaBanco();
        c3.setNumConta(333);
        c3.setDono("Luiz");
        c3.abrirConta("CC");
        c3.sacar(50);
        c3.depositar(100);
        c3.pagarMensal();
        c3.info();
    }

}
