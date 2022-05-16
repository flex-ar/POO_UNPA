package CuentasBancarias;

public class TestCajero {
  public static void main(String[] args) {

    CajeroAutomatico cajero = new CajeroAutomatico(new Banco("Nacion"));

    cajero.depositar(100.00,200);
    cajero.depositar(400000,100);
    cajero.extraer(100,100);
    cajero.extraer(5,200);

    System.out.println("Saldo cuenta 100: " + cajero.getSaldo(100));
    System.out.println("Saldo cuenta 200: " + cajero.getSaldo(200));

  }
}
