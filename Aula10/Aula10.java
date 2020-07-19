package aula10;
public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        System.out.println(p1.getNome());
        p2.setNome("Maria");
        System.out.println(p2.getNome());
        p3.setNome("Cláudio");
        System.out.println(p3.getNome());
        p4.setNome("Fabiana");
        System.out.println(p4.getNome());
        
        p2.setCurso("Informática");
        System.out.println(p2.getCurso());
        p3.setSalario(2500.75f);
        System.out.println(p3.getSalario());
        p4.setSetor("Estoque");
        System.out.println(p4.getSetor());
        p2.setSexo("F");
        System.out.println(p2.getSexo());
        p2.setIdade(23);
        System.out.println(p2.getIdade());
        p2.fazerAniversario();
        System.out.println(p2.getIdade());
        p2.cancelarMatricula();
        System.out.println(p2.getCurso());
        p3.receberAumento(50f);
        System.out.println(p3.getSalario());
        
        System.out.println("---------------");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

}
