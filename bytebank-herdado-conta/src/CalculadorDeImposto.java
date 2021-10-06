
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel T) {
		double valor = T.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
