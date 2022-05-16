package CuentasBancarias;

public class TestCuentas {
	public static void main(String[] args) {	
		CuentaBancaria c1 = new CuentaBancaria(111, new Cliente("Analia","Espa�a 571"));
		CuentaBancaria c2 = new CuentaBancaria(222, new Cliente("Juan", "Rawson 999"));
		
		c1.depositar(100);
		c2.depositar(200);
		
		System.out.println("SALDO C1 = "+ c1.getSaldo());
		System.out.println("SALDO C2 = "+ c2.getSaldo());

		c1.extraer(50);
		c2.extraer(100);

		System.out.println("SALDO C1 = "+ c1.getSaldo());
		System.out.println("SALDO C2 = "+ c2.getSaldo());

		c1.extraer(60);

		System.out.println("SALDO C1 = "+ c1.getSaldo());
	}
}
