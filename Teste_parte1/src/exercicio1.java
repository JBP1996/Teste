import java.util.Scanner;

public class exercicio1 {

	public exercicio1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String recebe;
		char[] caracteres= new char[5];
		int contar=0;
		System.out.println("Insira 5 caracteres");
		recebe = new Scanner(System.in).nextLine();
		caracteres=recebe.toCharArray();
		
		for(int i=0;i<recebe.length();i++){
			numero(caracteres[i]);
			if(numero(caracteres[i])==true){
				contar++;
			}
			
		}
		System.out.println("Existem "+contar+" caracteres correspondentes entre 0 e 9");
	}
	
	static boolean numero(char caracter){
			
		switch(caracter){
		case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9': return true;
		default: return false;
		}
		
	}

}
