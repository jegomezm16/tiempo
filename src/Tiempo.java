public class Tiempo {

        private int hora;
        private int minuto;
        private String meridiano;

        public Tiempo(int hora, int minuto, String meridiano) {
            this.hora = hora;
            this.minuto = minuto;
            this.meridiano = meridiano.toUpperCase();
        }

        public int getHora() { return hora; }
        public void setHora(int hora) { this.hora = hora; }
        public int getMinuto() { return minuto; }
        public void setMinuto(int minuto) { this.minuto = minuto; }
        public String getMeridiano() { return meridiano; }
        public void setMeridiano(String meridiano) { this.meridiano = meridiano; }


        public String calcularHoraMilitar() {
            int h = this.hora;

            if (meridiano.equals("PM") && h < 12) h += 12;
            if (meridiano.equals("AM") && h == 12) h = 0;

            return String.format("%02d:%02d", h, minuto);
        }

        public int calcularDiferenciaEnHoras(Tiempo tiempoMayor) {
            int minutos1 = convertirAMinutosTotales(this);
            int minutos2 = convertirAMinutosTotales(tiempoMayor);

            return Math.abs(minutos2 - minutos1) / 60;
        }

        private int convertirAMinutosTotales(Tiempo t) {
            int h = t.getHora();
            if (t.getMeridiano().equals("PM") && h < 12) h += 12;
            if (t.getMeridiano().equals("AM") && h == 12) h = 0;
            return (h * 60) + t.getMinuto();
        }
    }

