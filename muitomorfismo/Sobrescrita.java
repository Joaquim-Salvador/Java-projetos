package muitomorfismo;

class Funcionario {
    public void dados(String nome, int idade) {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + " anos");
    }
}

class Gerente extends Funcionario {
    @Override
    public void dados(String nome, int idade) {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + " anos\nFunção: Gerente\n");
    }
}

class Vendedor extends Funcionario {
    @Override
    public void dados(String nome, int idade) {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + " anos\nFunção: Vendedor\n");
    }
}

class Diretor extends Funcionario {
    @Override
    public void dados(String nome, int idade) {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + " anos\nFunção: Diretor\n");
    }
}

public class Sobrescrita  {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Funcionario diretor = new Diretor();
        Funcionario vendedor = new Vendedor();

        gerente.dados("Jorge", 55);
        diretor.dados("Ana", 40);
        vendedor.dados("Carlos", 30);
    }
}
