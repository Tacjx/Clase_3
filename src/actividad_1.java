
public class actividad_1 {

	public static void main(String[] args) {
		System.out.println("Actividad A");
		System.out.println(actA("elefante",'e'));
		System.out.println("");
		
		
		System.out.println("Actividad B");
		int[] respuesta= actB(10,25,3,"mayor");
		for(int i=0; i<respuesta.length;i++) {
			System.out.print(respuesta[i]+ " ");
		}
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Actividad C");
		int[] vector= {22,55,10,2,16,14,25};
		System.out.println(actC(vector, 15));
		
		

		
		
		
	}
	
	public static int actA(String palabra, char letra) {
		int contador=0;
		
		for(int i=0; i<palabra.length();i++) {
			if(palabra.charAt(i)==letra) {
				contador++;
			}
		}
		return contador;
	}
	
	
	public static int[] actB(int num1, int num2, int num3, String orden) {
		int[] resultado= new int[3];
		
		resultado[0]=num1;
		resultado[1]=num2;
		resultado[2]=num3;
		
		
		int auxiliar=0;
		
		if(orden=="mayor") {
			for(int i=0;i<resultado.length;i++) {
				for(int j=i+1;j<resultado.length;j++) {
					if (resultado[i]<resultado[j]) {
						auxiliar=resultado[i];
						resultado[i]=resultado[j];
						resultado[j]=auxiliar;
					}
					}
				}
				
			}
		else {
			for(int i=0;i<resultado.length;i++) {
				for(int j=i+1; j<resultado.length;j++) {
					if(resultado[i]<resultado[j]) {
						auxiliar=resultado[j];
						resultado[j]=resultado[i];
						resultado[i]=auxiliar;					}
				}
			}
		}
		
		return resultado;

}
	
	public static int actC(int[] numeros, int num) {
		int respuesta=0;
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>num) {
				respuesta= respuesta+numeros[i];
			}
		}
		return respuesta;
	}
}
