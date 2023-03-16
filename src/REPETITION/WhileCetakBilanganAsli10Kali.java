package REPETITION;

public class WhileCetakBilanganAsli10Kali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10) {
			if(i % 5 == 0) System.out.println(i);
			else System.out.print(i+ " ");
			i++;
		}
	}

}
