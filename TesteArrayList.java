import java.util.*;

public class TesteArrayList {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    int sair = 0;
    
    ArrayList<String> lista = new ArrayList<>();

    do {
    System.err.print("1) Adicionar\n2) Listar\n3) Excluir\n4) Editar \n5) Sair\nOpção: ");

    int escolha = sc.nextInt();

    switch (escolha){

        case 1 -> {
            System.out.println("Digite algo para adicionar: ");
            sc.nextLine();
            String adicionar = sc.nextLine();
            lista.add(adicionar);
            }
         

        case 2 -> {
            if (lista.isEmpty()){
                System.out.println("Nenhum usuário cadastrado");
            }
            for (int i = 0; i < lista.size(); i++){
                System.out.println("Id "+ i + ": " + lista.get(i));
            }   }

        case 3 -> {
            System.out.print("Digite o id do usuário que será deletado: ");
            int id = sc.nextInt();

            if (id < 0 || id >= lista.size()){
                System.out.println("Esse id não existe na lista");
            } else {
                System.out.println("Usuário(a) " +lista.get(id)+ " foi removido(a)");
                lista.remove(id);
            }
            }

        case 4 -> {
            System.out.print("Digite o id que será editado: ");
            int id = sc.nextInt();

            if (id < 0 || id >= lista.size()){
                System.out.println("Esse id não existe na lista");
            } 
            System.out.println("Novo nome: ");
            sc.nextLine();
            String novoUsuario = sc.nextLine();

            System.out.print("Usuário " + lista.get(id) + " alterado para " + novoUsuario + "\n");

            lista.set(id, novoUsuario);
        }
        case 5 -> {
            System.out.println("Saindo...");
            sair = 5;
            }

        default -> System.out.println("Número inválido, digite um número da lista");
    }} while (sair != 5);
    

sc.close();

}
}
