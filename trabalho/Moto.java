package trabalho;

public class Moto extends Veiculo{
	int qtdRodas;
	int qtdPassageiros;
	int qtdPortas;
	public Moto(int id, String marca, String cor, String modelo, String placa, String nomeCliente, int qtdRodas, int qtdPassageiros, int qtdPortas){
		super(id, marca, cor, modelo, placa, nomeCliente); 
		this.qtdRodas = qtdRodas;
		this.qtdPassageiros = qtdPassageiros;
		this.qtdPortas = qtdPortas;
	}
	
	public int getQtdRodas() {
		return qtdRodas;
	}
	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

}
