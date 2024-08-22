package Ex002;

public class Retangulo extends Formas{
    double lado1;
    double lado2;
    
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea() {
        double area = lado1*lado2;
        return area;
    }

    public Retangulo(String cor, double lado1, double lado2) {
        super(cor);
        setLado1(lado1);
        setLado2(lado2);
    }

    
}
