package trabalho;

public class Caminhao extends Veiculo{
	int largura;
	int comprimento;
	int altura;
	public Caminhao(int id, String marca, String cor, String modelo, String placa, String nomeCliente, int largura, int comprimento, int altura){
		super(id, marca, cor, modelo, placa, nomeCliente); 
		this.largura = largura;
		this.comprimento = comprimento;
		this.altura = altura;
	}
	
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}


}
