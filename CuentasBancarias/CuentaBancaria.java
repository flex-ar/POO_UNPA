package CuentasBancarias;

public class CuentaBancaria {
	private int nro;
	private double saldo;
	private Cliente titular;

	public CuentaBancaria(int nro, Cliente cliente) {
		this.setNro(nro);
		this.titular = cliente;
		this.saldo = 0;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public int getNro() {
		return nro;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double monto) {
		saldo = saldo + monto;
	}

	public void extraer(double monto) {
		if (saldo >= monto) saldo = saldo - monto;
		else System.out.println("Saldo insuficiente");
	}
}
