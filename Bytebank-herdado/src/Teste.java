
public class Teste {

	public static void main(String[] args) {
		Funcionario f1 = new EditorVideo();
		f1.setSalario(3000);

		
		System.out.println(f1.getSalario());
		
		Funcionario f2 = new Gerente();
		f2.setSalario(3000);
		
		System.out.println(f2.getSalario());
	}
}
