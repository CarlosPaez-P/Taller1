public class Estudiante {
    String nombre;
    int edad;
    String carrera;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Mathew";
        this.edad = 25;
        this.carrera = "Sistemas";
    }

    // Constructor parametrizado
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Método para mostrar detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                '}';
    }
    
}
