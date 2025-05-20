public class CuentaBancaria {
   String titular;
   double saldo;

    // Constructor por defecto
    public CuentaBancaria() {
        this.titular = "Paez";
        this.saldo = 50.000;
    }

    // Constructor parametrizado
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para mostrar detalles de la cuenta
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    
}
