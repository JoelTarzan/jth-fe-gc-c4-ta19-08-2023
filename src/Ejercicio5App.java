public class Ejercicio5App {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 3;
		int c = 6;
		int d = 8;
		
		System.out.println("Valores iniciales: a = " + a + " | b = " + b + " | c = " + c + " | d = " + d);
		
		b = c;
		System.out.println("b toma el valor de c: a = " + a + " | b = " + b + " | c = " + c + " | d = " + d);
		
		c = a;
		System.out.println("c toma el valor de a: a = " + a + " | b = " + b + " | c = " + c + " | d = " + d);
		
		a = d;
		System.out.println("a toma el valor de d: a = " + a + " | b = " + b + " | c = " + c + " | d = " + d);
		
		d = b;
		System.out.println("d toma el valor de b: a = " + a + " | b = " + b + " | c = " + c + " | d = " + d);
	}

}