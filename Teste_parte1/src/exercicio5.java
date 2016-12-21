
public class exercicio5 {

	public exercicio5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {5,2,7};
		int produto=1;
		
		for(int i=0;i<numeros.length;i++){
			produto*=numeros[i];
		}
		
		System.out.println("resultado "+produto);
	}

}
