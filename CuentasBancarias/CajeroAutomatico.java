package CuentasBancarias;

public class CajeroAutomatico {
  private Banco banco;

  public CajeroAutomatico(Banco banco) {
    this.banco = banco;
  }

  public void depositar(double monto, int nro) {
    banco.depositar(monto, nro);
  }

  public void extraer(double monto, int nro) {
    banco.extraer(monto,nro);
  }

  public double getSaldo(int nro) {
    return banco.getSaldo(nro);
  }
}
