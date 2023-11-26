package projetos2;

public class Trabalho02 {
	public static void main(String []args) { 
		System.out.println("Hello World");
	}
	public static void ex001(String []args) {
			int v1 = 10;
			int v2 = 20;
			int resultado = v1 + v2;
			
			System.out.println("O resultado da soma entre " + v1 + " e " + v2 + " resulta em: " + resultado);
	}
		
	public static void ex002(String []args) {
			int v1 = 6;
			int v2 = 4;
			int v3 = 9;
			int media = (v1 + v2 + v3) / 3;
			
			System.out.println("A média entre " + v1 + ", " + v2 + ", " + v3 + " é: " + media);
	}
	public static void ex003(String[] args) {
		double temperaturaCelsius = 40.0;

        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
	}

}
