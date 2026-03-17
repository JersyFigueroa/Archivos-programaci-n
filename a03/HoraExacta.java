
package a03;

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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj instanceof HoraExacta) {
        HoraExacta otra = (HoraExacta) obj;
            return this.hora == otra.hora &&
               this.minuto == otra.minuto &&
               this.segundo == otra.segundo;
    }

    return false;
}
}
