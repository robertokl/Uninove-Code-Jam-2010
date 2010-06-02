import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cuco {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> r = new ArrayList<String>();
		
		System.out.println("Digite a quantidade de cuco e o tempo que cada um demora para completar uma hora ou 0 para parar");
		String qTestes = br.readLine();
		while(!qTestes.equals("0")) {
			String[] cucos = qTestes.split(" ");
			ArrayList<Integer> nums = new ArrayList<Integer>();
			for (int x = 1; x < cucos.length; x++) {
				nums.add(Integer.valueOf(cucos[x]));				
			}
			Integer mmc = allMmc(nums);
			if(mmc.equals(0) || mmc > 10000) {
				r.add("Levará um bom tempo até o próximo canto simultâneo.");
			} else {
				r.add("Irá Demorar " + mmc + " minutos até o próximo canto dos cucos");
			}
			
			qTestes = br.readLine();
		}
		
		for (String string : r) {
			System.out.println(string);
		}
	}

	public static int allMmc(ArrayList<Integer> nums) {
		ArrayList<Integer> mmcs = new ArrayList<Integer>();
		for (int i = 0; i < nums.size() - 1; i++) {
			Integer mmc = mmc(nums.get(i), nums.get(i + 1));
			if(mmc.equals(0)) return 0;
			mmcs.add(mmc);
		}
		
		if(mmcs.size() == 1) return mmcs.get(0);
		return allMmc(mmcs);
	}
	public static Integer mmc(int a, int b) {
		int aa = a;
		int bb = b;
		a = 0;
		b = 0;
		ArrayList<Integer> aaa = new ArrayList<Integer>();
		ArrayList<Integer> bbb = new ArrayList<Integer>();
		for(int o = 0; o < 10000; o++) {
			a = a + aa;
			b = b + bb;
			aaa.add(a);
			bbb.add(b);
			
			for (int i = 0; i < aaa.size(); i++) {
				for (int j = 0; j < bbb.size(); j++) {
					if(aaa.get(i).equals(bbb.get(j))) {
						return aaa.get(i);
					}
				}
			}
		}
		return 0;
	}
}
