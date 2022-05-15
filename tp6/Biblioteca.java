package tp6;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Biblioteca {
  private List<Socio> socios;
  private List<Libro> libros;

  public Biblioteca() {
    socios = new ArrayList<>();
    libros = new ArrayList<>();
    this.inicializarSocio();
    this.inicializarLibros();
  }

  private void inicializarSocio() {
    socios.add(new Socio(1, "Juan Manuel", "Arnedo", 4180158));
    socios.add(new Socio(2, "Olga Fanny", "Arnedo", 4127884));
    socios.add(new Socio(3, "Carmen Adelina", "Cabezas", 1231231));
    socios.add(new Socio(4, "Jose Manuel", "Arnedo", 601675));
  };

  private void inicializarLibros() {
    libros.add(new Libro(
      1,
      "titulo1",
      "Addison Wesley",
      new Autor("Wilf", "Lalonde", "nacionalidad")
    ));
    libros.add(new Libro(
      2,
      "titulo2",
      "editorial",
      new Autor("nombre", "apellido", "nacionalidad")
    ));
    libros.add(new Libro(
      3,
      "titulo3",
      "Addison Wesley",
      new Autor("Wilf", "Lalonde", "nacionalidad")
    ));
  };

  public void agregarSocio(Socio socio) {
    socios.add(socio);
  }

  public void agregarLibro(Libro libro) {
    libros.add(libro);
  }

  public int cantidadSocios() {
    return socios.size();
  }

  public List<Libro> buscarPorEditorial(String editorial) {
    return libros.stream().filter(libro -> libro.getEditorial() == editorial).collect(toList());
  }

  public int cantidadLibrosPorAutor(String nombre, String apellido) {
    return libros.stream()
      .filter(libro -> libro.getAutor().getNombre() == nombre && libro.getAutor().getApellido() == apellido)
      .collect(toList())
      .size();
  }
}
