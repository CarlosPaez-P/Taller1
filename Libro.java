public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        this.titulo = "Narnia";
        this.autor = "El cachon";
        this.numeroPaginas = 700;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}