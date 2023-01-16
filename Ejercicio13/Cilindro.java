package Ejercicio13;

public class Cilindro extends Circulo{
    private double altura;

    public Cilindro(double radio,double altura){
        super(radio);
        this.altura=altura;
        if (altura<0)
            altura=0;
    }

    public double getAltura() {
        return altura;
    }
    public double getVolumen(){
        return getArea()*altura;
    }
}
