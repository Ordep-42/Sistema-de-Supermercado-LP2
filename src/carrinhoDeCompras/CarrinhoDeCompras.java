package carrinhoDeCompras;

import produto.Produto;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private ArrayList<Produto> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}
	
	public void adicionarItem(Produto produto) {
		itens.add(produto);
	}
	
	public void processarCompra() {
		// for ou for each para chamar o metodo do preco final em cada produto da lista, e mostrar o valor total da compra no final.
		System.out.println("============ CARRINHO =============");
		double total = 0;
		
		for (Produto produto : itens) {
			double preco = produto.calcularPrecoFinal();
			System.out.printf("%-25s R$%.2f%n", produto.getNome(), preco);
			total += preco;
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.printf("TOTAL A PAGAR:            R$%.2f%n", total);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
}
