
public class contaPoupanca extends Conta {

	public contaPoupanca (int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
