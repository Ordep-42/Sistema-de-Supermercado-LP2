package fornecedor;

public class Fornecedor {
	
	private String nomeEmpresa;
	private String nif;
	private String paisOrigem;
	
	public Fornecedor(String newNomeEmpresa, String newNif, String newPaisOrigem) {
		this.nomeEmpresa = newNomeEmpresa;
		this.nif = newNif;
		this.paisOrigem = newPaisOrigem;
	}
	
	public String getNomeEmpresa() { return this.nomeEmpresa; }
	public void setNomeEmpresa(String newNomeEmpresa) { this.nomeEmpresa = newNomeEmpresa; }
	
    public String getNif() { return nif; }
    public void setNif(String newNif) { this.nif = newNif; }

    public String getPaisOrigem() { return paisOrigem; }
    public void setPaisOrigem(String newPaisOrigem) { this.paisOrigem = newPaisOrigem; }
    
    public void exibirDetalhesFornecedor() {
    	System.out.println("======= DADOS DE FORNECEDOR =======");
    	System.out.println("Fornecedor: " + this.nomeEmpresa);
    	System.out.println("NIF: " + this.nif);
    	System.out.println("País de Origem: " + this.paisOrigem);
    	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
