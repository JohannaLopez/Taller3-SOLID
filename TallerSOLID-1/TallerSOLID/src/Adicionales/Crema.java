package Adicionales;

public class Crema extends Aderezo {
    public Crema(){
        setNombre();
    } 
//modificando
    @Override
    public void setNombre() {
        nombre = "CREMA";
    }
}