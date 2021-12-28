
public class PrincipalMain {

	public static void main(String[] args) {

		Cuenta ca = new CajaAhorro();
		Cuenta auxca=ca;
		ca.setSaldo(100);
		ca.extraer(10);
		System.out.println("Saldo ca: "+ca.informarSaldo());

		auxca.extraer(10);
		System.out.println("Saldo ca: "+ca.informarSaldo());

		ca= new CuentaCorriente();
		ca.depositar(100);
		System.out.println("Imp. recaudado: "+((CuentaCorriente)ca).gravar(0.2));

		System.out.println("Saldo ca: "+ca.informarSaldo());
		System.out.println("Saldo auxca: "+auxca.informarSaldo());
		if (auxca instanceof CajaAhorro){
			System.out.println(((CajaAhorro)auxca).informarSaldo());
		}
		Cuenta cuentaComitente1 = new CuentaComitente();
		CuentaComitente cc1=(CuentaComitente)cuentaComitente1;
		cc1.setClave("BGF");
		cuentaComitente1.depositar(1000);
		((CuentaComitente)cuentaComitente1).extraer(800,"BGF");
		System.out.println("Saldo CComitente1: "+cuentaComitente1.informarSaldo());


	}

}
