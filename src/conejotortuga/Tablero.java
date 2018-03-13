
package conejotortuga;


public class Tablero {
    private int conejo, tortuga;
    
public Tablero(){
    conejo=1;
    tortuga=1;
}    
    
public int getconejo() {
    return conejo;
}
public void putconejo(int value) {
    conejo+=value;
    
}
public void getposicion(int value) {
    conejo=value;
    
}
public int gettortuga() {
    return tortuga;
}
public void puttortuga(int value) {
    tortuga+=value;
    
}
public void settortuga(int value) {
    tortuga=value;
    
}
}
