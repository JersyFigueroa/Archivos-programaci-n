
package a05;

import a04.Instrumento;
import a04.Nota;

public class Piano extends Instrumento {

    @Override
    public void interpretar() {
        for (Nota n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
