
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		
		g.setSenha(2222);
		
		Cliente c = new Cliente(); 
		c.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2122);
		
		SistemaInternado si = new SistemaInternado();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c);
		

	}

}
