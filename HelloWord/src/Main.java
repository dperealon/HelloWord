import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo!");
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int rand;
		for (int i = 0; i <= 10; i++) {
			rand = numeroRandom(0, 100);
			if(numeros.indexOf(rand) == -1) {
				numeros.add(rand);
			}else {
				i--;
			}
		}
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
	}
	
	public static int numeroRandom(int minimo, int maximo) {
		
		int rand = (int) (Math.random() * (maximo+1)) + minimo; 
		
		return rand;
		
	}
	
}
