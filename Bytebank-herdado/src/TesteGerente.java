
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Jessica");
		g1.setCpf("091.252.589-40");
		g1.setSalario(3500);
		
		System.out.println(g1.getCpf());
		System.out.println(g1.getBonificacao());
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());

	}

}
