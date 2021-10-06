//GErente herda da class Funcionario autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	private AutenticacaoUtil autenticador;
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do GERENTE.");
		return getSalario();
	}
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}