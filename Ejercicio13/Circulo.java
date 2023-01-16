package Ejercicio13;

public class Circulo {
    private double radio;

    public Circulo(double radio){
        this.radio=radio;;
        if (radio<0)
            radio=0;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return radio*radio*Math.PI;
    }

    public static void main(String[] args) {
        Circulo cir=new Circulo(9);
        Cilindro cil = new Cilindro(7,12);
        System.out.println("Area= "+cir.getArea());
        System.out.println("Altura= "+cil.getAltura());
        System.out.println("Volumen= "+cil.getVolumen());
        System.out.println("Area= "+cil.getArea());
    }
}
