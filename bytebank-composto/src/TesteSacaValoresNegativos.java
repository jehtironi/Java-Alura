
public class TesteSacaValoresNegativos {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);

		// pribido:
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		
		System.out.println(conta.getSaldo());
	}
}
