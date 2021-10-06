
public class TesteContas {

	public static void main(String[] args) {
		
		contaCorrente outra = null;
		outra.deposita(200);
		
		contaCorrente cc = new contaCorrente(111, 111);
		cc.deposita(100.0);
		
		contaPoupanca pp = new contaPoupanca(222, 222);
		pp.deposita(200.0);
		
		cc.transfere(10.0, pp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("PP: " + pp.getSaldo());

	}

}
