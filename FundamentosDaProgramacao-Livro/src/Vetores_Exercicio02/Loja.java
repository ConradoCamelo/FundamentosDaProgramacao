package Vetores_Exercicio02;

import java.util.Arrays;
import java.util.Objects;

public class Loja {
	
	private double salario = 545;
	private Produto [] produtos;
	private String nomeAgenda;
	
	public Loja(String nomeAgenda) {
		super();
		this.nomeAgenda = nomeAgenda;
	}
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	public double Valortotal(){
		double valorT = 0;
		
		for (Produto produto : produtos) {
			valorT = valorT + (produto.getValorProd()*produto.getQuant());
			
		}
		return valorT;
	}
	
	public String obterInfo() {
		String info = "-------------Nome Loja: " + nomeAgenda+"----------------\n";
		for(Produto p : produtos ) {
		info+= p.obterInfo();
		
		}
		return info;
	}
	
	public double comissao() {
		double comissaoVededor = Valortotal() * 0.05;
		return comissaoVededor;
	}
	
	public void SalarioTotal() {
		System.out.println("Salario Total: "+ (salario + comissao()));
	}
}


