package entidade;

public class ItensPedidos {
	
	private Integer quantidade;
	private Double preco;
	
	private Produtos produto;

	public ItensPedidos() {
	}
	
	public ItensPedidos(Integer quantidade, Produtos produto) {
		this.quantidade = quantidade;
		this.produto = produto;
		this.subTotal(quantidade, produto);;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	private void subTotal(Integer quantidade, Produtos produto) {
		preco = quantidade * produto.getPreco();
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return produto.toString() + "Quantidade: " + quantidade + ", SubTotal: " + preco + "\n";
	}
}
