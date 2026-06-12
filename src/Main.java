 public class Main {
    public static void main(String[] args) {

        System.out.println("====== PRUEBAS DE FECHA Y EDAD ======");

        // Creamos tu fecha de nacimiento
        Fecha nacimiento = new Fecha(16, Mes.AGOSTO, 2004);

        // Creamos la fecha actual de prueba
        Fecha fechaActual = new Fecha(31, Mes.MAYO, 2026);

        // Probando los métodos
        System.out.println("Mes de nacimiento: " + nacimiento.mostrarMesEnLetras());
        System.out.println("Años completos transcurridos: " + nacimiento.calcularDiferenciaEnAniosExactos(fechaActual));
        System.out.println("Meses completos transcurridos: " + nacimiento.calcularDiferenciaEnMesesExactos(fechaActual));
        System.out.println("-> EDAD EXACTA: " + nacimiento.calcularEdadExacta(fechaActual));


        System.out.println("\n====== PRUEBAS DE TIEMPO ======");

        // Creamos dos horas
        Tiempo horaInicio = new Tiempo(10, 0, Meridiano.AM);
        Tiempo horaFin = new Tiempo(2, 30, Meridiano.PM);

        System.out.println("Hora inicio (Militar): " + horaInicio.calcularHoraMilitar());
        System.out.println("Hora fin (Militar): " + horaFin.calcularHoraMilitar());
        System.out.println("Diferencia de tiempo: " + horaInicio.calcularDiferenciaEnHoras(horaFin) + " horas.");
    }
}