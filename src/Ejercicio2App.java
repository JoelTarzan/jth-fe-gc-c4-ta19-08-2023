public class Ejercicio2App {

	public static void main(String[] args) {
		
		int n = 9;
		double a = 36.2;
		char c = 'L';
		
		System.out.println("Variable N = " + n);
		System.out.println("Variable A = " + a);
		System.out.println("Variable C = " + c);
		
		System.out.println(n + " + " + a + " = " + (n + a));
		System.out.println(a + " - " + n + " = " + (a - n));
		System.out.println("El valor numérico del carácter " + c + " = " + Character.getNumericValue(c));
	}

}
