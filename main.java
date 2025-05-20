public class main {
    public static void main(String[] args) {
        // Crear un libro usando el constructor por defecto
        Libro libro1 = new Libro();
        System.out.println(libro1.toString());

        // Crear un libro usando el constructor parametrizado
        Libro libro2 = new Libro("El Quijote", "Cervantes", 500);
        System.out.println(libro2.toString());

        // Crear un estudiante usando el constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1.toString());

        // Crear un estudiante usando el constructor parametrizado
        Estudiante estudiante2 = new Estudiante("Juan", 20, "Ingeniería");
        System.out.println(estudiante2.toString());

        // Crear una cuenta bancaria usando el constructor por defecto
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println(cuenta1.toString());

        // Crear una cuenta bancaria usando el constructor parametrizado
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana", 15.000);
        System.out.println(cuenta2.toString());
    }
    
}
