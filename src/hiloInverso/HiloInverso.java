package hiloInverso;

import calculo.Calculo;

public class HiloInverso implements Runnable {
    private Calculo calculo;

    public HiloInverso(Calculo calculo) {
        this.calculo = calculo;

    }

    @Override
    public void run() {
        try {
            calculo.calcular4();
            calculo.calcular3();
            calculo.calcular2();
            calculo.calcular1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
