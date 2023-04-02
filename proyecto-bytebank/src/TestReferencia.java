
public class TestReferencia {
	
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.setSaldo(200); 
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.setSaldo(200); 
		
		System.out.println("Saldo primera cuenta "+ primeraCuenta.getSaldo());
		
		System.out.println("Saldo segunda cuenta "+ segundaCuenta.getSaldo());
		
		segundaCuenta.getSaldo();
		System.out.println("Saldo primera cuenta "+ primeraCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta ) {
			System.out.println("Son la misma cuenta ");
		} else {
			System.out.println("Son diferentes ");
		}
	}
}
