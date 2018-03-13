
package conejotortuga;


public class Tortuga {
    int posicion;
        

    public Tortuga(){
    
    }
    public Tortuga(int posicion){
        this.posicion=posicion;
}
    public int getposicion(){
        return posicion;
    }
    
    public void setAvancerapido(){
        posicion = posicion+3;
    }
       
    public void setResbalo(){
        if(posicion>6)
            posicion=posicion-6;
        else
            posicion=1;
    }
    public void setAvanceLento(){
       posicion=posicion+1;
        
}
}