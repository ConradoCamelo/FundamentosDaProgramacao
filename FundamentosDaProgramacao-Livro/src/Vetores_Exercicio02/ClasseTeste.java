package Vetores_Exercicio02;

import java.util.Scanner;

public class ClasseTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Nome da Loja");
		String nomeLoja= scan.nextLine();
		
		Loja loja = new Loja(nomeLoja);
		
		Produto[] produtos = new Produto[3];
		
		
		for(int i=0; i<3; i++) {
			
		Produto p = new Produto();
		
		System.out.println("Nome Produto");
		String nome = scan.nextLine();
		
		System.out.println("Quantidade de Produto");
		int quant = scan.nextInt();
		
		System.out.println("Valor do Produto");
		double valor = scan.nextDouble();
		
		scan = new Scanner (System.in);
		
		p.setNomeProd(nome);
		p.setQuant(quant);
		p.setValorProd(valor);
		
		produtos[i] = p;		
		}
		
		loja.setProdutos(produtos);
		
		System.out.println(loja.obterInfo());	
		System.out.println("Valor Total: " +loja.Valortotal());
		System.out.println("Comissão do Vendedor: " + loja.comissao());
		loja.SalarioTotal();
		
		
		scan.close();
	}

}
