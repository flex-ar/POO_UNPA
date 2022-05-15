package tp6;
/*
Se desea modelar en objetos e implementar en Java un sistema para la biblioteca de la
UNPA-UACO. Para nosotros sólo será relevante modelar la biblioteca con sus socios y los
libros disponibles (no tener en cuenta la gestión de préstamos de libros a socios). A cada
socio de la biblioteca se le asigna un número de socio. De los socios interesa conocer el
nombre y apellido y teléfono.
Cada libro disponible en la biblioteca tiene un ISBN (código único que permite identificar a
cada libro), el título, editorial y autor principal. De los autores interesa conocer su nombre y
apellido y nacionalidad.
a. Realizar el modelo de clases. ✔
Implementar los mensajes necesarios para:
b. Crear e inicializar la biblioteca (con sus libros y socios). ✔
c. Agregar un libro a la biblioteca. ✔
d. Agregar un socio a la biblioteca. ✔
e. Retornar la cantidad de socios con que cuenta la biblioteca. ✔
f. Retornar todos los libros cuya editorial sea ‘Addison Wesley’. Es decir, retornar una
colección (un arrayList) que contenga los objetos libro que cumplan la condición indicada. ✔
g. Retornar la cantidad de libros cuyo autor sea ‘Wilf Lalonde’. ✔
*/

public class TestBiblioteca {
  public static void main(String[] args) {
    Socio socio1 = new Socio(1, "Juan Manuel", "Arnedo", 418015);

    Autor autor1 = new Autor("Joanne", "Rowling", "britanica");
    Libro libro1 = new Libro(123,"Harry Potter","Editorial add", autor1);

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.agregarSocio(socio1);
    biblioteca.agregarLibro(libro1);

    System.out.println("cantidad de socios: " + biblioteca.cantidadSocios());

    System.out.println(biblioteca.buscarPorEditorial("Addison Wesley"));
    System.out.println(biblioteca.buscarPorEditorial("NO EXISTE"));

    System.out.println(biblioteca.cantidadLibrosPorAutor("Wilf", "Lalonde"));
    System.out.println(biblioteca.cantidadLibrosPorAutor("NO", "EXISTE"));
  }
}