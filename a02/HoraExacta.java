
package a02;

import a01.Hora;

public class HoraExacta extends Hora {
    private int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        setSegundos(segundo);
    }

    public boolean setSegundos(int valor) {
        if (valor >= 0 && valor < 60) {
            this.segundo = valor;
            return true;
        }
        return false;
    }

    @Override
    public void inc() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
