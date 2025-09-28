import java.util.*;

public class TesteArrayList {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    int sair = 0;
    
    ArrayList<String> lista = new ArrayList<>();
    

    do {
    System.err.println("1) Adicionar\n2) Listar\n3) Excluir\n4) Sair");
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
            System.out.println("Digite o id do usuário que será deletado: ");
            int id = sc.nextInt();
            System.out.println("Usuário(a) " +lista.get(id)+ " foi removido(a)");
            lista.remove(id);

            if (id > lista.size() || id < lista.size()){
                System.out.println("Esse id não existe na lista: ");
            }
            }

        case 4 -> {
            System.out.println("Saindo...");
            sair = 4;
            }

        default -> System.out.println("Número inválido, digite um número da lista");
    }} while (sair != 4);
    

sc.close();

}
}
