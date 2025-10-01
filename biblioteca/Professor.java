package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private String materia;
    private int id;
    private List<Livro> livrosPegos = new ArrayList<>();

    public Professor(String nome, String cpf, String materia, int id) {
        super(nome, cpf);
        this.materia = materia;
        this.id = id;
    }

    public String getMateria() { return materia; }
    public int getId() { return id; }

    // adiciona se não estiver presente
    public void adicionarLivro(Livro livro) {
        if (livro != null && !livrosPegos.contains(livro)) {
            livrosPegos.add(livro);
        }
    }

    // remove o livro (usado na devolução)
    public void removerLivro(Livro livro) {
        livrosPegos.remove(livro);
    }

    public void informacoes() {
        System.out.println(
            "\nNome: " + nome +
            "\nCPF: " + cpf +
            "\nMatéria: " + materia +
            "\nId: " + id
        );

        if (livrosPegos.isEmpty()) {
            System.out.println("Livros: Nenhum");
        } else {
            System.out.println("Livros: ");
            for (Livro l : livrosPegos) {
                System.out.println(" - " + l.getNomeLivro());
            }
        }
    }
}
