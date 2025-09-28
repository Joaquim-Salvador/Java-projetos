public class Banco{
     double saldo;
     String nome;
   
    public Banco(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    public void exibirTudo(){
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: R$" + saldo + "\n");
    }
    public void depositar(double valorDeposito){  
        if (valorDeposito > 0){
        this.saldo += valorDeposito;
        System.out.println("Valor depositado: R$" + valorDeposito + "\n");
    }   else {
        System.out.println("Valor para depósito inválido");
    }
    }

    public void sacar(double saque){
        if (saque > saldo){
            System.out.println("Você não possui essa quantia");
        } else {
            this.saldo -= saque;

        }
    }
    public void transferir(Banco destino, double valorTranferencia ){
        if (saldo < valorTranferencia){
            System.out.println("Você não possui essa quantia, impossível transferir");
        } else {
            this.sacar(valorTranferencia);
            destino.depositar(valorTranferencia);
            System.out.println("Transferência de R$" + valorTranferencia + " para "+ destino.nome +" concluída!");
        }
    }

    public static void main(String[] args) {
        
        Banco c1 = new Banco("João", 1000);
        Banco c2 = new Banco("Maria", 800);
        Banco c3 = new Banco("Carlos", 1200);
        Banco c4 = new Banco("Ana", 500);
        Banco c5 = new Banco("Pedro", 1500);
        Banco c6 = new Banco("Juliana", 700);
        Banco c7 = new Banco("Felipe", 300);
        Banco c8 = new Banco("Mariana", 950);
        Banco c9 = new Banco("Rafaela", 400);
        Banco c10 = new Banco("Bruno", 600);

    
        c1.depositar(200);
        c3.depositar(150);
        c5.depositar(500);
        c7.depositar(100);
        c9.depositar(250);


        c2.sacar(300);
        c4.sacar(100);
        c6.sacar(200);
        c8.sacar(150);
        c10.sacar(50);
        c1.sacar(400);
        c3.sacar(100);
        c5.sacar(700);
        c7.sacar(50);


        c1.transferir(c2, 100);
        c3.transferir(c4, 200);
        c5.transferir(c6, 300);
        c7.transferir(c8, 80);
        c9.transferir(c10, 150);
        c2.transferir(c5, 250);

  
        System.out.println("\n--- Saldos Finais ---");
        c1.exibirTudo();
        c2.exibirTudo();
        c3.exibirTudo();
        c4.exibirTudo();
        c5.exibirTudo();
        c6.exibirTudo();
        c7.exibirTudo();
        c8.exibirTudo();
        c9.exibirTudo();
        c10.exibirTudo();
}
}
