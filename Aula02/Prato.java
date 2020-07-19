package aula2;
public class Prato {
    String material;
    String marca;
    String cor;
    String estampa;
    Float diametro;
    Float espessura;
    int unidade;
    boolean disponivel;
    boolean limpo;
    boolean seco;
    boolean quebrado;
    
    void pegar(){
        if (this.unidade >= 1 && this.disponivel == true){
            System.out.println("Você pode pegar o prato!");
        } else {
            System.out.println("Você não pode pegar o prato!");
        }
    }
    
    void usar(){
        if (this.unidade >= 1 && this.disponivel == true && this.limpo == true && this.seco == true && this.quebrado == false){
            System.out.println("Você pode usar o prato!");
        } else {
            System.out.println("Você não pode usar o prato!");
        }
    }
    
    void limpar(){
        if (this.unidade >= 1 && this.disponivel == true && this.limpo == false){
            System.out.println("Você pode limpar o prato!");
        } else {
            System.out.println("Você não pode limpar o prato!");
        }
    }
    
    void secar(){
        if (this.unidade >= 1 && this.disponivel == true && this.limpo == true && this.seco == false && this.quebrado == false){
            System.out.println("Você pode secar o prato!");
        } else {
            System.out.println("Você não pode secar o prato!");
        } 
        }
    
    void guardar(){
        if (this.unidade >= 1 && this.disponivel == true && this.limpo == true && this.seco == true && this.quebrado == false){
            System.out.println("Você pode guardar o prato!");
        } else {
            System.out.println("Você não pode guardar o prato!");
        }
       }
    
    void jogar(){
        if (this.unidade >= 1 && this.disponivel == true){
            System.out.println("Você pode jogar o prato!");
        } else {
            System.out.println("Você não pode jogar o prato!");       
        }
    }
    
    void status(){
        System.out.println("Material: " + material);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Estampa: " + estampa);
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Espessura: " + espessura);
        System.out.println("Unidade(s): " + unidade);
        System.out.println("Está disponível? " + disponivel);
        System.out.println("Está limpo? " + limpo);
        System.out.println("Está seco? " + seco);
        System.out.println("Está quebrado? " + quebrado);
    }
}
