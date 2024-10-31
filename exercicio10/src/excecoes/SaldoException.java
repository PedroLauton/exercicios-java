package excecoes;

public class SaldoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public SaldoException(String erro) {
		super(erro);
	}
}
