package entidade;

public class Produtos {
	
	private String name;
	private Double preco;
	
	public Produtos() {
	}
	
	public Produtos(String name, Double preco) {
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return name + ", $" + preco + ", ";
	}
}
