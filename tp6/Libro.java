package tp6;

public class Libro {
  private int ISBN;
  private String titulo;
  private String editorial;
  private Autor autor;

  public Libro(int ISBN, String titulo, String editorial, Autor autor) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.editorial = editorial;
    this.autor = autor;
  }

  public int getISBN() {
    return ISBN;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getEditorial() {
    return editorial;
  }

  public Autor getAutor() {
    return autor;
  }
}
