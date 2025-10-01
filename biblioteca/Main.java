package biblioteca;

public class Main {
    public static void main(String[] args) {
        //Criando livros 
        Livro livro1 = new Livro("1984", "George Orwell", "Mil Novecentos e Oitenta e Quatro");
        Livro livro2 = new Livro("To Kill a Mockingbird", "Harper Lee", "O Sol é para Todos");
        Livro livro3 = new Livro("The Great Gatsby", "F. Scott Fitzgerald", "O Grande Gatsby");
        Livro livro4 = new Livro("Pride and Prejudice", "Jane Austen", "Orgulho e Preconceito");
        Livro livro5 = new Livro("Moby Dick", "Herman Melville", "Moby Dick");
        Livro livro6 = new Livro("War and Peace", "Leo Tolstoy", "Guerra e Paz");
        Livro livro7 = new Livro("The Catcher in the Rye", "J.D. Salinger", "O Apanhador no Campo de Centeio");
        Livro livro8 = new Livro("The Hobbit", "J.R.R. Tolkien", "O Hobbit");
        Livro livro9 = new Livro("Crime and Punishment", "Fyodor Dostoevsky", "Crime e Castigo");
        Livro livro10 = new Livro("Brave New World", "Aldous Huxley", "Admirável Mundo Novo");

        //Criando professores e alunos 
        Professor prof1 = new Professor("João", "098120983471", "Química", 1);
        Professor prof2 = new Professor("Maria", "12121212121", "História", 2);

        Aluno aluno1 = new Aluno("Ricardo", "87887921", "12631982", "M2");
        Aluno aluno2 = new Aluno("Ana", "55555555555", "345678", "T1");

        //Testando métodos 
        System.out.println(" Emprestando livros para João (professor)");
        livro1.disponível();
        livro1.emprestar(prof1);

        livro2.emprestar(prof1);
        livro3.emprestar(prof1);
        livro4.emprestar(prof1);

        prof1.informacoes(); // lista os livros que o professor João tem

        System.out.println("\n João devolve um livro");
        livro2.devolver();
        prof1.informacoes();

        System.out.println("\n Ana (aluna) pega alguns livros");
        livro5.emprestar(aluno2);
        livro6.emprestar(aluno2);
        aluno2.informacoes();

        System.out.println("\n Testando conflito (emprestar livro já emprestado)");
        livro1.emprestar(aluno1); // já estava com João

        System.out.println("\n Agora João devolve e Ricardo pega");
        livro1.devolver();
        livro1.emprestar(aluno1);

        aluno1.informacoes();

        System.out.println("\n Maria (professora) pega livros de Tolkien");
        livro7.emprestar(prof2);
        livro8.emprestar(prof2);
        livro9.emprestar(prof2);
        livro10.emprestar(prof2);

        prof2.informacoes();
    }
}
