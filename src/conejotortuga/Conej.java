
package conejotortuga;

import static java.lang.Thread.sleep;

//tenemos un comentario
//otro comentarioo
public class Conej extends Thread {
    private Conejo c= new Conejo();
    private Tablero ta;
    private int numero;
public Conej(Tablero ta, int numero) {
    this.ta = ta;
    this.numero = numero;
}
    @Override
    public void run() {
        double value;
        do{
        value = ta.getconejo();
        value = Math.random()*70;
        if (value>=20 && value<40){
            double r=(Math.random()*3)+1;
            if (r>=1 && r<2)
                ta.putconejo(1);
            else if(r>=2 && r<=3)
                if (ta.getconejo()>3)
                ta.putconejo(-2);
            else
                ta.putconejo(1);
        }
        else if (value>=40 && value<50)
            ta.putconejo(3);
        else 
            if(ta.getconejo()>13)
               ta.putconejo(-12);
            else
                ta.putconejo(1);
        System.out.println("La posicion del conejo es: " + ta.getconejo());
        try {
            sleep(numero);
            } catch (InterruptedException e) {}

    }while(ta.getconejo()<70||ta.gettortuga()<70);
        System.out.println("-------------FIN-------------");
    }
    }