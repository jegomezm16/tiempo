public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }
    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String mostrarMesEnLetras() {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        if (mes >= 1 && mes <= 12) {
            return meses[mes - 1];
        }
        return "Mes no válido";
    }

    public int calcularDiferenciaEnAnios(Fecha fechaMayor) {
        return Math.abs(fechaMayor.getAnio() - this.anio);
    }

    public int calcularDiferenciaEnMeses(Fecha fechaMayor) {
        int totalMeses1 = (this.anio * 12) + this.mes;
        int totalMeses2 = (fechaMayor.getAnio() * 12) + fechaMayor.getMes();
        return Math.abs(totalMeses2 - totalMeses1);
    }
}
