package Ex002;

public class Quadrado extends Formas{
    double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        double area = lado*lado;
        return area;
    }

    public Quadrado(String cor, double lado) {
        super(cor);
        setLado(lado);
    }
    
}
