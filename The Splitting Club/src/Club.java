import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Club {
	public static Integer howManySections(Integer R, ArrayList<ArrayList<Integer>> groups) {
		for (ArrayList<Integer> group : groups) {
			Integer maior = findMaior(group);
			Integer menor = findMenor(group);
			Float rs = maior.floatValue() / menor;
			if(rs > R) {
				split(group, R);
			}
		}
		
		return 0;
	}
	
	private static void split(ArrayList<Integer> group, Integer R) {
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> r = new ArrayList<String>();

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("Digite a quantidade de idades e o R:");
			String in = br.readLine();
			if (in.equals("0 0.0")) {
				break;
			}
			Integer vezes = Integer.valueOf(in.split(" ")[0]);
			Float R = Float.valueOf(in.split(" ")[1]);
			ArrayList<Integer> groups = new ArrayList<Integer>();
			System.out.println("Digite a idade e a quantidade de pessoas:");
			for (int j = 0; j < vezes; j++) {
				String group = br.readLine();
				groups.add(Integer.valueOf(group.split(" ")[0]));
			}
		}
		
		for (String string : r) {
			System.out.println(string);
		}
	}
	
	
	private static Integer findMenor(ArrayList<Integer> lista) {
		Integer m = Integer.MAX_VALUE;
		for (Integer i : lista) {
			if(i < m) {
				m = i;
			}
		}
		return m;
	}

	
	private static Integer findMaior(ArrayList<Integer> lista) {
		Integer m = Integer.MAX_VALUE * -1;
		for (Integer i : lista) {
			if(i > m) {
				m = i;
			}
		}
		return m;
	}
}
