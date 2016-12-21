import java.util.Scanner;

public class exercicio3 {

	
	public exercicio3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int golos[] = new int[4];
		double media=0;
		
		for(int i=0;i<golos.length;i++){
		
			System.out.println("Insira o numero de golos que o jogador marcou no "+(i+1)+" jogo");
			golos[i]= new Scanner(System.in).nextInt();
			media+=golos[i];
		}
		
		media/=golos.length;
		
		System.out.println("O jogador marca em media "+media+" golos");
		
	}
	
}
