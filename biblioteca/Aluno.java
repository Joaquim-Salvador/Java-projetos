package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private String turma;
    private List<Livro> livrosPegos = new ArrayList<>();

    public Aluno(String nome, String cpf, String matricula, String turma) {
        super(nome, cpf);
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTurma() {
        return turma;
    }

    // adiciona livro à lista (se ainda não estiver lá)
    public void adicionarLivro(Livro livro) {
        if (livro != null && !livrosPegos.contains(livro)) {
            livrosPegos.add(livro);
        }
    }

    // remove livro da lista
    public void removerLivro(Livro livro) {
        livrosPegos.remove(livro);
    }

    // mostra todas as infos do aluno + livros que pegou
    public void informacoes() {
        System.out.println(
            "\nNome: " + nome +
            "\nCPF: " + cpf +
            "\nMatrícula: " + matricula +
            "\nTurma: " + turma
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
