package produto;

import fornecedor.Fornecedor;

public class ProdutoEletronico extends Produto {
	
	private int mesesGarantia;
	
	public ProdutoEletronico(String newNome, int newCodigoBarras, double newPrecoBase, Fornecedor newFornecedor, int newMesesGarantia) {
		super(newNome, newCodigoBarras, newPrecoBase, newFornecedor);
		this.mesesGarantia = newMesesGarantia;
	}

	public int getMesesGarantia() { return this.mesesGarantia; }
	public void setMesesGarantia(int newMesesGarantia) { this.mesesGarantia = newMesesGarantia; }
	
	@Override
	public double calcularPrecoFinal() {
		double precoFinal = this.getPrecoBase() * 1.5;
		
		if (this.mesesGarantia > 12) {
			precoFinal *= 1.15;
		}
		
		return precoFinal;
	}

}
