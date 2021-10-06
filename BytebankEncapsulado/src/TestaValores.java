
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		// Conta está inconsistente
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(2337, 24227);
		Conta conta3 = new Conta(2338, 24228);
		
		System.out.println(Conta.getTotal());

	}

}
