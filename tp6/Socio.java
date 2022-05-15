package tp6;

public class Socio {
  private int numero;
  private String nombre;
  private String apellido;
  private int telefono;

  public Socio(int numero, String nombre, String apellido, int telefono) {
    this.numero = numero;
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
  }

  public int getNumero() {
    return numero;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public int getTelefono() {
    return telefono;
  }
}
