package tp6;

public class Autor {
  private String nombre;
  private String apellido;
  private String nacionalidad;

  public Autor(String nombre, String apellido, String nacionalidad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.nacionalidad = nacionalidad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public String getNacionalidad() {
    return this.nacionalidad;
  }
}
