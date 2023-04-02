
public class PruebaMetodos {
	
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta();
		//miCuenta.saldo = 300;
		miCuenta.depositar(200);
		
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		
		if(cuentaDeJimena.transferir(400, miCuenta)) {
			System.out.println("Transferencia Exitosa!");
		} else {
			System.out.println("No fue posible realizar la transferencia");
		}
		
		System.out.println(cuentaDeJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}
