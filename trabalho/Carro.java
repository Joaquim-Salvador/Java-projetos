package trabalho;

public class Carro extends Veiculo{
	String quilometragem;
	String anoFabricacao;
	String dataCompra;
	public Carro(int id, String marca, String cor, String modelo, String placa, String nomeCliente, String quilometragem, String anoFabricacao, String dataCompra) {
	    super(id, marca, cor, modelo, placa, nomeCliente); 
	    this.quilometragem = quilometragem;
	    this.anoFabricacao = anoFabricacao;
	    this.dataCompra = dataCompra;
	}

	public String getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

}
