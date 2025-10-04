import java.util.*;

class Pessoa{
    String nome, senha;

    public Pessoa(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    public String getNome(){
        return nome;
    }
    public String getSenha(){
        return senha;
    }
    
}

public class Login {
     public static void main(String[] args) {
    ArrayList<Pessoa> listaUsuarios = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    boolean sair = false;

     do{
        System.out.print("1) Entrar\n2) Cadastrar\n3) Excluir conta\n4) Sair\n Opção: ");
        int opcao2 = sc.nextInt();

        switch(opcao2){
                case 1 -> { 
                    System.out.print("Digite seu usuário: ");
                    sc.nextLine();
                    String usuario = sc.nextLine();

                    System.out.print("Digite sua senha: ");
                    String senhaLogin = sc.nextLine();

                    boolean encontrado = false;

                    for (Pessoa c : listaUsuarios){
                        if (c.getNome().equalsIgnoreCase(usuario) && c.getSenha().equals(senhaLogin)){
                            System.out.println("Você entrou no sistema");
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Usuário ou senha incorretos");
                    }
            }
                case 2 -> { 
                    System.out.print("Digite o usuário: ");
                    sc.nextLine();
                    String novoUsuario = sc.nextLine();

                    boolean confirmar = false;

                    if (novoUsuario.isEmpty()) {
                        System.out.println("Nome de usuário não pode ser vazio.");
                        break;
                    }
                    for (Pessoa j : listaUsuarios) {
                        if (j.getNome().equalsIgnoreCase(novoUsuario)) {
                            confirmar = true;
                            break;
                        }
                    }

                    if (confirmar) {
                        System.out.println("Esse nome já está sendo utilizado, tente outro nome");
                    } else {
                        System.out.print("Digite a senha: ");
                        String novaSenha = sc.nextLine();
                        listaUsuarios.add(new Pessoa(novoUsuario, novaSenha));
                        System.out.println("Novo usuário adicionado com sucesso");
                    }
                }
            case 3 -> {
                System.out.print("Digite o usuário: ");
                sc.nextLine();
                String usuarioExcluir = sc.nextLine();
                
                System.out.print("Digite a senha: ");
                String senhaExcluir = sc.nextLine();
                
                for (int i = 0; i < listaUsuarios.size(); i++){
                    if (listaUsuarios.get(i).getNome().equalsIgnoreCase(usuarioExcluir) && listaUsuarios.get(i).getSenha().equals(senhaExcluir)) {
                        listaUsuarios.remove(i);
                        System.out.println("Usuário removido com sucesso!");
                        break;
                    }}
            }
           case 4 -> {
               System.out.println("Saindo do sistema...");
               sair = true;
            }
           default -> System.out.println("Número inválido, digite um número da lista");
                     
        }
        

     } while (!sair);

}}