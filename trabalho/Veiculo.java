package trabalho;

public class Veiculo {
    private int id;
    private String marca;
    private String cor;
    private String modelo;
    private String placa;
    private String nomeCliente;

    public Veiculo(int id, String marca, String cor, String modelo, String placa, String nomeCliente) {
        this.id = id;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.nomeCliente = nomeCliente;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
