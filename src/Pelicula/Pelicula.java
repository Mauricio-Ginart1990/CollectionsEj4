
package Pelicula;



public class Pelicula {
   private String titulo;
    private String director;
   private Double duraccion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duraccion) {
        this.titulo = titulo;
        this.director = director;
        this.duraccion = duraccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuraccion() {
        return duraccion;
    }

    public void setDuraccion(Double duraccion) {
        this.duraccion = duraccion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duraccion=" + duraccion + '}';
    }

  

   
}
