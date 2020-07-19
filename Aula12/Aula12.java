package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero(89.3f, 2, 4, "neve");
        Reptil r = new Reptil(0.35f, 1, 0, "musgo");
        Peixe p = new Peixe(0.35f, 1, 0, "anil");
        Ave a = new Ave(0.89f, 2, 2, "âmbar");
        Canguru can = new Canguru(55.30f, 3, 4, "bege");
        Cachorro dog = new Cachorro(3.94f, 5, 4, "caramelo");
        Cobra cob = new Cobra(0.3f, 1, 0, "preta");
        Tartaruga t = new Tartaruga(0.5f, 1, 4, "musgo");
        GoldFish g = new GoldFish(0.1f, 1, 0, "dourado");
        Arara ar = new Arara(0.3f, 2, 2, "vermelha");
        
        System.out.println(m.toString());
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("");
        
        System.out.println(r.toString());
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("");
        
        System.out.println(p.toString());
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolhas();
        System.out.println("");
        
        System.out.println(a.toString());
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("");
        
        System.out.println(can.toString());
        can.locomover();
        can.alimentar();
        can.emitirSom();
        can.usarBolsa();
        System.out.println("");
        
        System.out.println(dog.toString());
        dog.locomover();
        dog.alimentar();
        dog.emitirSom();
        dog.enterrarOsso();
        dog.abanarRabo();
        System.out.println("");
        
        can.setIdade(18);
        System.out.println(can.toString());
    }

}
