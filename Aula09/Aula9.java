package aula9;
public class Aula9 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3]; 
    
    p[0] = new Pessoa("Pedro", 22, "M");
    p[1] = new Pessoa("Maria", 25, "F");
    l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
    l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
    l[2] = new Livro("Java Avançado", "Maria Cândido", 800, p[0]);
    
    l[0].abrir();
    l[0].folhear(400);
    System.out.println(l[0].detalhes());
    l[1].abrir();
    l[1].folhear(351);
    l[1].voltarPag();
    System.out.println(l[1].detalhes());
    System.out.println(l[2].detalhes());
    }
}
