import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ParOuImpar {
	public static String vencedor(Integer n1, Integer n2, String jPar,
			String jImpar) {
		String r = new String();

		if ((n1 + n2) % 2 == 0) {
			r = jPar;
		} else {
			r = jImpar;
		}

		return r;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String qTestes = "";
		ArrayList<String> r = new ArrayList<String>();

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("Digite a quantidade de testes:");
			qTestes = br.readLine();
			if (qTestes.equals("0")) {
				break;
			}
			Integer t = i + 1;
			r.add("Teste " + t);
			System.out.println("Nome do primeiro jogador:");
			String jPar = br.readLine();
			System.out.println("Nome do segundo jogador:");
			String jImpar = br.readLine();
			System.out.println("Digite o número de dedos de cada jogador:");
			for (int j = 0; j < Integer.valueOf(qTestes); j++) {
				String in = br.readLine();
				String[] s = in.split(" ");
				r.add(vencedor(Integer.valueOf(s[0]), Integer.valueOf(s[1]),
						jPar, jImpar));
			}
		}
		
		for (String string : r) {
			System.out.println(string);
		}
	}
}
