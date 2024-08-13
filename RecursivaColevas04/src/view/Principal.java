package view;
import controller.FatorialDuplo;
public class Principal {
	public static void main(String[] args) {
		 FatorialDuplo fatDup = new FatorialDuplo();
		int num=7;
		int resp= fatDup.Fatorial(num);
		System.out.println(resp);
	}


}
