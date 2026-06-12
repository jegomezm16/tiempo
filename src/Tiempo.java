public class Tiempo {
    private int hora;
    private int minuto;
    private Meridiano meridiano;


    public Tiempo(int hora, int minuto, Meridiano meridiano) {
        this.hora = hora;
        this.minuto = minuto;
        this.meridiano = meridiano;
    }

    public int getHora() { return hora; }
    public void setHora(int hora) { this.hora = hora; }
    public int getMinuto() { return minuto; }
    public void setMinuto(int minuto) { this.minuto = minuto; }
    public Meridiano getMeridiano() { return meridiano; }
    public void setMeridiano(Meridiano meridiano) { this.meridiano = meridiano; }

    public String calcularHoraMilitar() {
        int h = this.hora;

        if (meridiano == Meridiano.PM && h < 12) h += 12;
        if (meridiano == Meridiano.AM && h == 12) h = 0;

        return String.format("%02d:%02d", h, minuto);
    }

    public int calcularDiferenciaEnHoras(Tiempo tiempoMayor) {
        int minutos1 = convertirAMinutosTotales(this);
        int minutos2 = convertirAMinutosTotales(tiempoMayor);
        return Math.abs(minutos2 - minutos1) / 60;
    }

    private int convertirAMinutosTotales(Tiempo t) {
        int h = t.getHora();
        if (t.getMeridiano() == Meridiano.PM && h < 12) h += 12;
        if (t.getMeridiano() == Meridiano.AM && h == 12) h = 0;
        return (h * 60) + t.getMinuto();
    }
}