package Vetores_Exercicio02;

public class Produto {
	
	private String nomeProd;
	private int quant;
	private double valorProd;
	
	
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public double getValorProd() {
		return valorProd;
	}
	public void setValorProd(double valorProd) {
		this.valorProd = valorProd;
	}
	
	public String obterInfo() {
		
		return "Nome do Produto: " + nomeProd + "\n" 
		+ "Quantidade de Produto: " + quant + "\n" +
		"Preço do Produto: " + valorProd+"\n"+"---------------------------------"+
		"\n";
		
		
		
	} 
	

}
