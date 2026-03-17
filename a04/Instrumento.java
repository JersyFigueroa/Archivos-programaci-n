
package a04;

import java.util.ArrayList;

public abstract class Instrumento {
    protected ArrayList<Nota> notas;

    public Instrumento() {
        notas = new ArrayList<>();
    }

    public void add(Nota nota) {
        notas.add(nota);
    }

    public abstract void interpretar();
}
