package aula14;
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao;
        novaAvaliacao = (this.getAvaliacao() + avaliacao)/this.getViews();
        this.avaliacao = novaAvaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" +
                avaliacao + ", views=" + views + ", curtidas=" +
                curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    @Override
    public void play() {
        if (this.isReproduzindo()){
            System.out.println("ERRO! Já está reproduzindo!");
        } else {
            System.out.println("Play no vídeo!");
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if (this.isReproduzindo()){
            System.out.println("Pause no vídeo!");
            this.setReproduzindo(false);
        } else {
            System.out.println("ERRO! Já está pausado!");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
}
