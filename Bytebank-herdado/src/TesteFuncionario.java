
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Gerente();
		nico.setNome("Nico stre");
		nico.setCpf("09785478548-9");
		nico.setSalario(3500);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getSalario());
		System.out.println(nico.getCpf());

		
	}

}
