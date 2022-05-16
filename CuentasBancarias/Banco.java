package CuentasBancarias;

import java.util.*;

public class Banco {
	
	private ArrayList<CuentaBancaria> cuentas;
	private String nombre;

	public Banco(String nombre) {
		cuentas = new ArrayList<>();
		this.setNombre(nombre);
		this.agregarCuentas();
	}

	public void agregarCuenta(CuentaBancaria cuenta) {
		cuentas.add(cuenta);
	}

	public void agregarCuentas() {
		/* Crea clientes */
		Cliente cliente1, cliente2, cliente3;
		cliente1 = new Cliente("Pepe", "Pico Truncado");
		cliente2 = new Cliente("Juan", "Caleta Olivia");
		cliente3 = new Cliente("Anal�a", "Comodoro Rivadavia");

		/* Crea cuentas y las agrega a la lista de cuentas del banco */
		this.agregarCuenta(new CuentaBancaria(200, cliente1));
		this.agregarCuenta(new CuentaBancaria(50, cliente2));
		this.agregarCuenta(new CuentaBancaria(100, cliente3));
	}

	public Optional<CuentaBancaria> buscar(int nro) {
		return cuentas.stream().filter(cuenta -> cuenta.getNro() == nro).findFirst();
	}

	public void depositar(double monto, int nro) {
		Optional<CuentaBancaria> cuenta = this.buscar(nro);

		if (cuenta.isPresent()) {
			cuenta.get().depositar(monto);
			System.out.println("Deposit� " + monto + " en cuenta " + nro);
		}
	}

	public void extraer(double monto, int nro) {
		Optional<CuentaBancaria> cuenta = this.buscar(nro);

		if (cuenta.isPresent()) {
			cuenta.get().extraer(monto);
			System.out.println("Extrajo " + monto + " en cuenta " + nro);
		}
	}

	public double getSaldo(int nro) {
		Optional<CuentaBancaria> cuenta = this.buscar(nro);
		return cuenta.get().getSaldo();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
