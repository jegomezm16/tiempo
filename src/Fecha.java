 public class Fecha {
    private int dia;
    private Mes mes;
    private int anio;

    // Constructor
    public Fecha(int dia, Mes mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Getters y Setters
    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }
    public Mes getMes() { return mes; }
    public void setMes(Mes mes) { this.mes = mes; }
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    // Comportamientos
    public String mostrarMesEnLetras() {
        return mes.name();
    }

    public int calcularDiferenciaEnAniosExactos(Fecha fechaMayor) {
        int diferenciaAnios = fechaMayor.getAnio() - this.anio;
        int mesActual = this.mes.ordinal();
        int mesMayor = fechaMayor.getMes().ordinal();

        // Regla de exactitud
        if (mesMayor < mesActual || (mesMayor == mesActual && fechaMayor.getDia() < this.dia)) {
            diferenciaAnios--;
        }
        return Math.abs(diferenciaAnios);
    }

    public int calcularDiferenciaEnMesesExactos(Fecha fechaMayor) {
        int numeroMes1 = this.mes.ordinal();
        int numeroMes2 = fechaMayor.getMes().ordinal();

        int diferenciaMeses = ((fechaMayor.getAnio() - this.anio) * 12) + (numeroMes2 - numeroMes1);

        // Regla de exactitud
        if (fechaMayor.getDia() < this.dia) {
            diferenciaMeses--;
        }
        return Math.abs(diferenciaMeses);
    }

    public String calcularEdadExacta(Fecha fechaActual) {
        int anios = fechaActual.getAnio() - this.anio;
        int meses = (fechaActual.getMes().ordinal() + 1) - (this.mes.ordinal() + 1);
        int dias = fechaActual.getDia() - this.dia;

        // Si los días dan negativo, pedimos 1 mes prestado
        if (dias < 0) {
            meses--;
            int mesAnteriorIndex = fechaActual.getMes().ordinal() - 1;

            if (mesAnteriorIndex < 0) {
                mesAnteriorIndex = 11; // Si retrocedemos desde Enero, llegamos a Diciembre
            }

            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int diasPrestados = diasPorMes[mesAnteriorIndex];

            // Ajuste bisiesto
            if (mesAnteriorIndex == 1 && (fechaActual.getAnio() % 4 == 0)) {
                diasPrestados = 29;
            }
            dias += diasPrestados;
        }

        // Si los meses dan negativo, pedimos 1 año prestado
        if (meses < 0) {
            anios--;
            meses += 12;
        }

        return anios + " años, " + meses + " meses y " + dias + " días.";
    }
}