package aula6;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        setVolume(50);
        setLigado(true);
        setTocando(false);
    }
    
    private int getVolume(){
        return volume;
    }

    private void setVolume(int v){
        this.volume = v;
    }
    
    private boolean isLigado(){
        return ligado;
    }

    private void setLigado(boolean l){
        this.ligado = l;
    }   
    
    private boolean isTocando(){
        return tocando;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()){
            System.out.println("------ MENU ------");
            System.out.println("Ligado: " + this.isLigado());
            System.out.println("Tocando: " + this.isTocando());
            System.out.printf("Volume: [" + this.getVolume() + "] ");
            for (int v = 0; v < this.getVolume() ; v += 10){
                System.out.printf("|");
            }
            System.out.println("");
        } else {
            System.out.println("Impossível exibir o menu.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("- Fechando o menu -");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Impossível aumentar o volume.");
        }    
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Impossível diminuir o volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        } else {
            System.out.println("Impossível mutar o som.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        } else {
            System.out.println("Impossível desmutar o som.");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        } else {
            System.out.println("Impossível tocar a música.");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Impossível pausar a música.");
        }
    }   
}



