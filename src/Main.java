public class Main {
    public static void main(String[] args) {

        System.out.println("--- PRUEBA DE FECHA ---");
        Fecha hoy = new Fecha(14, 5, 2026);
        Fecha navidad = new Fecha(25, 12, 2026);

        System.out.println("Mes actual: " + hoy.mostrarMesEnLetras());
        System.out.println("Diferencia en meses hasta navidad: " + hoy.calcularDiferenciaEnMeses(navidad));


        System.out.println("\n--- PRUEBA DE TIEMPO ---");


        Tiempo horaAlmuerzo = new Tiempo(2, 3, "PM");

        Tiempo horaEntrada = new Tiempo(10, 3, "AM");

        System.out.println("Hora de almuerzo en formato militar: " + horaAlmuerzo.calcularHoraMilitar());
        System.out.println("Hora de entrada en formato militar: " + horaEntrada.calcularHoraMilitar());

        int diferencia = horaEntrada.calcularDiferenciaEnHoras(horaAlmuerzo);
        System.out.println("Horas transcurridas entre entrada y almuerzo: " + diferencia + " horas");
    }
}