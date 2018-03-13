
package conejotortuga;

import static java.lang.Thread.sleep;


public class Tort extends Thread {
    private Tortuga t= new Tortuga();
    private Tablero ta;
    private int numero;
public Tort(Tablero ta, int numero) {
    this.ta = ta;
    this.numero = numero;
}
    @Override
    public void run() {
        double value;
        do{
        value = ta.gettortuga();
        value = Math.random()*50;
        if(value>=20 && value<30){
            double r=(Math.random()*3)+1;
            if(r>7)
                ta.puttortuga(-6);
            else
                ta.settortuga(1);
        }
        else if(value>=30 && value<50)
            ta.puttortuga(1);
        else 
            ta.puttortuga(3);
        
    System.out.println("La posicion de la tortuga es: " + ta.gettortuga());
       
    try {
        sleep(numero);
        } catch (InterruptedException e) {}
    }while(ta.getconejo()<70||ta.gettortuga()<70);
        System.out.println("-------------FIN-------------");

    }
}


