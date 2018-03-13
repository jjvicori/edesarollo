
package conejotortuga;

public class Conejo {
    int posicion;
    public Conejo(){
    
    }
    public Conejo(int posicion){
        this.posicion=posicion;
}
    public int getposicion(){
        return posicion;
    }
    
    public void setRgrande(){
        if(posicion>12)
            posicion=posicion-12;
        else
            posicion=1;
    }
    public void setPeqSalto(){
       posicion=posicion+1;
        
}
    public void setGraSalto(){
       posicion=posicion+9;
        
}
    public void setRpequeño(){
        if(posicion>2)
            posicion=posicion-2;
        else
            posicion=1;
    }
}
