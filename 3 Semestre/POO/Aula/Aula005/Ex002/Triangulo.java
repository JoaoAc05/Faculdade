package Ex002;

public class Triangulo extends Formas {
    double base;
    double altura;

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        double area = (base * altura)/2;
        return area;
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        setBase(base);
        setAltura(altura);
    }
    
}
