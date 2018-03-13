
package conejotortuga;


public class Main {
    public static void main(String[] args){
        Tablero t=new Tablero();
        Tort o;Conej c;
        do{
        o=new Tort(t,1000);
        c=new Conej(t,1000);
        o.start();
        c.start();
        
        }while(t.getconejo()<70||t.gettortuga()<70);
       
        
    
    }
}