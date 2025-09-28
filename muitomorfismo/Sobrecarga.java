package muitomorfismo;

class Sobrecarga {
    // Método somar com 2 números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método somar com 3 números inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método somar com 3 números, sendo um double
    public double somar(double a, int b, int c){
        return a + b + c;
    }

    // Método somar com 2 números decimais (double)
    public double somar(double a, double b) {
        return a + b;
    }

    // main dentro da mesma classe
    public static void main(String[] args) {
        Sobrecarga calcular = new Sobrecarga();

        System.out.println(calcular.somar(2, 3));        
        System.out.println(calcular.somar(7, 2, 1));  
        System.out.println(calcular.somar(12.3, 3, 4)); 
        System.out.println(calcular.somar(8.3, 2.4));    
    }
}
     