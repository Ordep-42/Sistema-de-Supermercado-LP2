package produto;

import fornecedor.Fornecedor;

public class ProdutoAlimento extends Produto {
	
	private int diasValidade;

	public ProdutoAlimento(String newNome, int newCodigoBarras, double newPrecoBase, Fornecedor newFornecedor, int newDiasValidade) {
		super(newNome, newCodigoBarras, newPrecoBase, newFornecedor);
		this.diasValidade = newDiasValidade;
	}
	
	public int getDiasValidade() { return this.diasValidade; }
	public void setDiasValidade(int newDiasValidade) { this.diasValidade = newDiasValidade; }

	@Override
	public double calcularPrecoFinal() {
		double precoFinal = this.getPrecoBase() * 1.2;
		
		if (this.diasValidade <= 5) {
			precoFinal *= 0.7;
		}
		
		return precoFinal;
	}
}
