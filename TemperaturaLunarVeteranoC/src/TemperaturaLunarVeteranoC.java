import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class TemperaturaLunarVeteranoC {
	public static String maiorEMenorTempLunar(ArrayList<Integer> temps, Integer media) {
		Integer i = temps.size() - media + 1;
		ArrayList<Integer> medias = new ArrayList<Integer>();
		for (int j = 0; j < i; j++) {
			Integer total = 0;
			for (int j2 = 0; j2 < media; j2++) {
				total += temps.get(j + j2);
			}
			medias.add(total / media);
		}
		Integer menor = findMenor(medias);
		Integer maior = findMaior(medias);
		return menor + " " + maior;
	}
	
	private static Integer findMenor(ArrayList<Integer> medias) {
		Integer m = Integer.MAX_VALUE;
		for (Integer media : medias) {
			if(media < m) {
				m = media;
			}
		}
		return m;
	}

	
	private static Integer findMaior(ArrayList<Integer> medias) {
		Integer m = Integer.MAX_VALUE * -1;
		for (Integer media : medias) {
			if(media > m) {
				m = media;
			}
		}
		return m;
	}

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> r = new ArrayList<String>();

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("Digite o número de temps adiquiridas e a quantidade para média:");
			String in = br.readLine();
			if (in.equals("0 0")) {
				break;
			}
			Integer vezes = Integer.valueOf(in.split(" ")[0]);
			Integer media = Integer.valueOf(in.split(" ")[1]);
			ArrayList<Integer> temps = new ArrayList<Integer>();
			System.out.println("Digite as temperaturas:");
			for (int j = 0; j < vezes; j++) {
				temps.add(Integer.valueOf(br.readLine()));
			}
			r.add("Teste " + (i +1));
			r.add(maiorEMenorTempLunar(temps, media));
		}
		
		for (String string : r) {
			System.out.println(string);
		}
	}
}
