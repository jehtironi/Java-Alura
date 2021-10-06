package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo + " reais.");
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		segundaConta.saldo += 100;
		
		System.out.println("Novo saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		if(primeiraConta.saldo == segundaConta.saldo) {
			System.out.println("Primeira conta é igual a segunda conta.");
		}

	}
}
