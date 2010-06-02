import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MediaVeteranoB {
	public static String media(ArrayList<Integer> notas) {
		notas.remove(notas.size() - 1);
		Integer total = 0;
		for (Integer nota : notas) {
			total += nota;
		}
		Float media = total.floatValue() / notas.size();
		
		Integer acima = 0;
		for (Integer nota : notas) {
			if(nota > media) {
				acima++;
			}
		}
		
		if(acima == 1) {
			return "A cidade possui 1 aluno acima da média.";
		} else {
			return "A cidade possui " + acima + " alunos acima da média.";
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("Digite a nota dos alunos da cidade e '-1' para terminar.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> notas = new ArrayList<Integer>();
		String in = "";
		while(!in.equals("-1")) {
			in = br.readLine();
			notas.add(Integer.valueOf(in));
		}
		System.out.println(media(notas));
	}
}
