package Ex002;

public class Circulo extends Formas{
    protected double raio;
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        double pi = 3.1415;
        double area = pi * (raio*raio);
        return area;
    }

    public Circulo(String cor, double raio) {
        super(cor);
        setRaio(raio);
    }
}
