package aula14;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 5 de POO");
        v[1] = new Video("Aula 15 de JavaScript");
        v[2] = new Video("Aula 30 de Python");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Lais", 22, "F", "Laly");
        g[1] = new Gafanhoto("Daniel", 23, "M", "Dan");
        
        Visualizacao vis[] = new Visualizacao [4];    
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();       
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87f);
   
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        
        vis[1].avaliar(87f);
        System.out.println(vis[1].toString());
        
        /*System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}
