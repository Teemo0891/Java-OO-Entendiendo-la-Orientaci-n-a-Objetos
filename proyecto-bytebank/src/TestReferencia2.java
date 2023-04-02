
public class TestReferencia2 {
	
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego"); 
		diego.setDocumento("11000454");
		diego.setTelefono("7152654");
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.setAgencia(1); 
		cuentaDeDiego.setTitular(diego);
		
		System.out.println(cuentaDeDiego.getTitular().getDocumento());
	}
}
