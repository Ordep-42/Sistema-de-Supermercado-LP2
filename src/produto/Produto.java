package produto;

import fornecedor.Fornecedor;

public abstract class Produto {
	
	private String nome;
	private int codigoBarras;
	private double precoBase;
	private Fornecedor fornecedor;
	
	public Produto(String newNome, int newCodigoBarras, double newPrecoBase, Fornecedor newFornecedor) {
		this.nome = newNome;
		this.codigoBarras = newCodigoBarras;
		this.precoBase = newPrecoBase;
		this.fornecedor = newFornecedor;
	}
	
	public String getNome() { return this.nome; }
	public void setNome(String newNome) { this.nome = newNome; }
	
	public int getCodigoBarras() { return this.codigoBarras; }
	public void setCodigoBarras(int newCodigoBarras) { this.codigoBarras = newCodigoBarras; }
	
	public double getPrecoBase() { return this.precoBase; }
	public void setPrecoBase(double newPrecoBase) { this.precoBase = newPrecoBase; }
	
	public Fornecedor getFornecedor() { return fornecedor; }
	public void setFornecedor(Fornecedor newFornecedor) { this.fornecedor = newFornecedor; }
	
	public abstract double calcularPrecoFinal();
	
	public void exibirResumo() {
		System.out.println("Produto: " + this.nome + " | Preço Base: R$" + this.precoBase);
	}
}
