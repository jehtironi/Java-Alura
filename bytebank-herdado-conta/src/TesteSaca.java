
public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta conta = new contaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		conta.saca(210.0);
		
		System.out.println(conta.getSaldo());
	}
}