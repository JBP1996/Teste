import java.util.Random;
import java.util.Scanner;

public class exercicio2 {

	static int pontos=0;
	
	public exercicio2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r= new Random();
		boolean continua=true;
		
		int valor=r.nextInt(11);
		int valorAnt=valor;
		do{
		
			String opcao;
					
			do{
				
				System.out.println("O valor seguinte é acima ou abaixo de "+valorAnt+"?");
				System.out.println("Tem que inserir c -> cima ou b -> baixo");
				opcao = new Scanner(System.in).next();
			}while(!opcao.equals("c") && !opcao.equals("C") && !opcao.equals("b") && !opcao.equals("B"));
			
			do{
				valor=r.nextInt(11);
			}while(valor==valorAnt);
			
			if(opcao.equals("c") || opcao.equals("C")){
				
				if(cima(valor,valorAnt)==false){
					break;
				}
				
			}else if(opcao.equals("b") || opcao.equals("B")){
				
				if(baixo(valor,valorAnt)==false){
					break;
				}
			}
			valorAnt=valor;
		}while(true);
		
		System.out.println("Obteve "+pontos+" pontos");
		
	}

	
	static boolean cima(int atual,int anterior){
	
		if(atual> anterior){
			System.out.println("Acertou " +atual+ " e maior que " +anterior+"\n");
			pontos++;
			return true;
		}else{
			System.out.println("Errou " +atual+ " e menor que " +anterior+"\n");
			return false;
		}
		
	}
	
	static boolean baixo(int atual,int anterior){
	
		if(atual< anterior){
			System.out.println("Acertou " +atual+ " e menor que " +anterior+"\n");
			pontos++;
			return true;
		}else{
			System.out.println("Errou " +atual+ " e maior que " +anterior+"\n");
			return false;
		}
		
	}
	

}
