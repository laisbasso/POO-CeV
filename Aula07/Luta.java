package aula7;

import java.util.Random;

public class Luta {
    Random random = new Random();
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if ((lutador1 != lutador2) && (lutador1.getCategoria().equals(lutador2.getCategoria()))){
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
            System.out.println("A batalha vai começar!!!");
        } else {
            this.setAprovada(false);
            System.out.println("A luta não foi aprovada!");           
        }
    }

    public void lutar(){
        if (this.isAprovada()){
            System.out.println("------ DESAFIADO ------");
            this.getDesafiado().apresentar();
            System.out.println("------ DESAFIANTE ------");
            this.getDesafiante().apresentar();
            int r = random.nextInt(3);
            
            switch(r){
                case 0:
                    System.out.println("EMPATE!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                   break;
                
                case 1:
                    System.out.println("-- " + this.getDesafiado().getNome() + " VENCE!!! --");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                
                default:
                    System.out.println("-- " + this.getDesafiante().getNome() + " VENCE!!! --");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
            }
            
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}