
public class CajaAhorro extends Cuenta {

	public static final double INTERES_CAJA_AHORRO = 1.2;
	
	
	@Override
	public void extraer(double monto) {
		if(informarSaldo() >= monto) {
			setSaldo(informarSaldo() - monto);
		}
		
	}

	public void cobrarIntereses() {
		setSaldo(informarSaldo() * CajaAhorro.INTERES_CAJA_AHORRO);
		
	}

	@Override
	public void depositar(double monto){
		if (monto<500000.0){
			// probar con super si da lo mismo
			setSaldo(informarSaldo()+monto);
		}
	}
}
