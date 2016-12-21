import java.util.Scanner;

public class exercicio6 {

	public exercicio6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int contar=0;
		System.out.println("Insira um numero");
		numero= new Scanner(System.in).nextInt();
		
		for(int i=1;i<=numero;i++){
			contar=0;
			for(int x=1;x<=i;x++){
				
				if(i%x==0){
					contar++;
				}
			}
			if(contar==2){
				System.out.println(i+ " é primo");
			}
			
		}
	}

}
