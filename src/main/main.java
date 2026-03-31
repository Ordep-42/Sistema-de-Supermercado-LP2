package main;

import fornecedor.Fornecedor;
import produto.*;
import carrinhoDeCompras.CarrinhoDeCompras;

public class main {

	public static void main(String[] args) {
		
		Fornecedor fazendaLocal = new Fornecedor("Fazenda Local", "916 423 587", "Brasil");
		Fornecedor techGlobal = new Fornecedor("TechGlobal", "864 987 469", "EUA");
		
		ProdutoAlimenticio feijao = new ProdutoAlimenticio("Feijão 1Kg", 789323415, 10.00, fazendaLocal, 3);
		
		ProdutoEletronico televisao = new ProdutoEletronico("Televisão SMART 4K", 478331249, 1560.00, techGlobal, 24);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem(feijao);
		carrinho.adicionarItem(televisao);
		
		//fazendaLocal.exibirDetalhesFornecedor();
		//techGlobal.exibirDetalhesFornecedor();
		
		//feijao.exibirResumo();
		//televisao.exibirResumo();
		
		carrinho.processarCompra();
	}

}
