package aula9;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPags;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPags, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPags = totalPags;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPags() {
        return totalPags;
    }

    public void setTotalPags(int totalPags) {
        this.totalPags = totalPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "----------\nLivro" + "\ntítulo: " + titulo + "\nautor: " + autor +
                "\ntotal de páginas: " + totalPags + "\npágina atual: " + pagAtual +
                "\naberto: " + aberto + "\nleitor: " + leitor.getNome() +
                "\nidade: " + leitor.getIdade() + "\nsexo: " + leitor.getSexo();
    }

    @Override
    public void abrir() {
        if (!this.isAberto()){
            System.out.println("Abrindo o livro...");
            this.setAberto(true);
        } else {
            System.out.println("Livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()){
            System.out.println("Fechando o livro...");
            this.setAberto(false);
        } else {
            System.out.println("Livro já está fechado.");
        }
    }

    @Override
    public void folhear(int p) {
        if (this.getPagAtual() + p > this.getTotalPags()){
            System.out.println("Impossível folhear");
        } else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        if (this.getTotalPags() - this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Avançando uma página...");
        } else {
            System.out.println("O livro está fechado.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Voltando uma página...");
        } else {
            System.out.println("O livro está fechado.");
        }
    }  
}

