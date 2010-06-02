import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Truco {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite o num de partidas disputadas");
		String in = br.readLine();
		Integer rodadas = Integer.valueOf(in);
		Integer vA = 0;
		for (int i = 0; i < rodadas; i++) {
			System.out.println("Digite as cartas mostradas por Adalberto seguida pelas cartas mostradas por Bernardete:");
			String sCartas = br.readLine();
			String[] cartas = sCartas.split(" ");
			if(aVenceu(cartas)) vA++;
		}
		System.out.println(vA + " " + (rodadas - vA));
	}
	
	public static boolean aVenceu(String cartas[]) {
		Integer a = 0;
		if(primeiraMaior(Integer.valueOf(cartas[0]), Integer.valueOf(cartas[3]))) a++;
		if(primeiraMaior(Integer.valueOf(cartas[1]), Integer.valueOf(cartas[4]))) a++;
		if(primeiraMaior(Integer.valueOf(cartas[2]), Integer.valueOf(cartas[5]))) a++;
		
		return a >= 2;
	}
	
	public static boolean primeiraMaior(Integer i1, Integer i2) {
		if(i1 == 3) return true;
		if(i1 == 2 && i2 != 3) return true;
		if(i1 == 1 && (i2 >= 4 || i2 == 1)) return true;
		if(i2 != 1 && i2 != 2 && i2 != 3 && i1 > i2) return true;
		
		return false;
	}
}
