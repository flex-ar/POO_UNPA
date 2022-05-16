package CuentasBancarias;

public class Cliente {
  private String nombre;
  private String domicilio;

  public Cliente(String nombre, String domicilio) {
    this.setNombre(nombre);
    this.setDomicilio(domicilio);
  }

  private void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  private void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }

  public String getDomicilio() {
    return domicilio;
  }
}
