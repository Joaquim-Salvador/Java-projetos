package biblioteca;

public class Livro {
    String titulo, autor, nomeLivro;
    boolean emprestado = false;
    Pessoa dono;

    public Livro(String titulo, String autor, String nomeLivro){
        this.titulo = titulo;
        this.autor = autor;
        this.nomeLivro = nomeLivro;
        this.emprestado = false;
    }
    public String getTitulo(){ return titulo; }
    public String getAutor(){ return autor; }
    public String getNomeLivro(){ return nomeLivro; }

    public void disponível(){
        if (!emprestado){
            System.out.println("Livro " + nomeLivro + " está disponível");
        } else {
            System.out.println("O livro " + nomeLivro + " não está disponível");
        }
    }

    public void emprestar(Pessoa pessoa){
        if (!emprestado){
            // se já tiver dono anterior (por segurança), remove dele primeiro
            if (dono != null) {
                if (dono instanceof Professor) {
                    ((Professor) dono).removerLivro(this);
                }
                // se tiver outros tipos com listas, trate aqui também
            }

            emprestado = true;
            dono = pessoa; // associa o livro à pessoa

            // se a pessoa for professor, adiciona automaticamente na lista
            if (pessoa instanceof Professor) {
                ((Professor) pessoa).adicionarLivro(this);
            }
            // se existir Aluno com lista, trate aqui também

            System.out.println(pessoa.getNome() + " pegou emprestado o livro " + nomeLivro);
        } else {
            System.out.println("O livro " + nomeLivro + " já está emprestado para " + (dono != null ? dono.getNome() : "alguém"));
        }
    }

    public void devolver(){
        if (emprestado){
            System.out.println(dono.getNome() + " devolveu o livro " + nomeLivro);

            // remover da lista do dono, se ele mantiver lista
            if (dono instanceof Professor) {
                ((Professor) dono).removerLivro(this);
            }
            // para outros tipos (Aluno) trate aqui também

            emprestado = false;
            dono = null;
        } else {
            System.out.println("O livro " + nomeLivro + " já está disponível");
        }
    }

    public Pessoa getDono(){
        return dono;
    }
}
