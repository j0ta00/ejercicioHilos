package calculo;

public class Calculo{
    Object o1=new Object();
    Object o2=new Object();
    Object o3=new Object();
    Object o4=new Object();

    public void calcular1() throws InterruptedException{
        synchronized (o1){
            System.out.println(String.format("Iniciando calculo 1 del hilo: %d", Thread.currentThread().getId()));
            Thread.sleep(1000);
            System.out.println(String.format("Finalizando calculo 1 del hilo: %d", Thread.currentThread().getId()));
        }
    }
    public void calcular2() throws InterruptedException {
        synchronized (o2) {
            System.out.println(String.format("Iniciando calculo 2 del hilo: %d", Thread.currentThread().getId()));
            Thread.sleep(1000);
            System.out.println(String.format("Finalizando calculo 2 del hilo: %d", Thread.currentThread().getId()));
        }
    }
    public void calcular3() throws InterruptedException {
        synchronized(o3){
            System.out.println(String.format("Iniciando calculo 3 del hilo: %d", Thread.currentThread().getId()));
            Thread.sleep(1000);
            System.out.println(String.format("Finalizando calculo 3 del hilo: %d", Thread.currentThread().getId()));
        }
    }
    public void calcular4() throws InterruptedException {
        synchronized (o4){
            System.out.println(String.format("Iniciando calculo 4 del hilo: %d", Thread.currentThread().getId()));
            Thread.sleep(1000);
            System.out.println(String.format("Finalizando calculo 4 del hilo: %d", Thread.currentThread().getId()));
        }
    }

}
