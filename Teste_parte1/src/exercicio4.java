import java.util.Scanner;

public class exercicio4 {

	public exercicio4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcao;
		int pessoas=0, camisolas=0;
		double bilhetes=0;
		do{
			do{
				System.out.println("O sócio tem camisola?\n");
				System.out.println("c -> com comisola \n s -> sem camisola \n n -> sair do programa");
				opcao = new Scanner(System.in).next();
			}while(!opcao.equals("c") && !opcao.equals("C") && !opcao.equals("s") && !opcao.equals("S") && !opcao.equals("n") && !opcao.equals("N"));
		
			switch(opcao){
			
				case "c": case "C": 
					camisolas++;
					pessoas++;
					break;
					
				case "s": case "S": 
					bilhetes++;
					pessoas++;
					break;
			}
			
		}while(!opcao.equals("n") && !opcao.equals("N"));
		
		camisolas*=14;
		bilhetes*=7.5;
		
		System.out.println("\n"+pessoas+" pessoas comprararam ingressos");
		System.out.println("Foi angariado "+camisolas+" € com camisolas");
		System.out.println("Foi angariado "+bilhetes+" € com bilhetes");
	}

}
