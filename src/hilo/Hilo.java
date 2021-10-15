package hilo;

import calculo.Calculo;

public class Hilo implements Runnable{
    private Calculo calculo;
    public Hilo(Calculo calculo){
        this.calculo=calculo;

    }

    @Override
    public void run(){
        try {
            calculo.calcular1();
            calculo.calcular2();
            calculo.calcular3();
            calculo.calcular4();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
