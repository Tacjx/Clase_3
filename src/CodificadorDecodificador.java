
public class CodificadorDecodificador {
	
	public static String codificar(String cadena, int desplazamiento) {
		String codificado= new String();
		
		for(int i=0; i<cadena.length();i++) {
			codificado += (char) (cadena.charAt(i)+desplazamiento);
		}
		
		return codificado;
	}
	
	
	public static String decodificar(String cadena, int desplazamiento) {
		String decodificado= new String();
		
		for(int i=0; i<cadena.length();i++) {
			decodificado += (char) (cadena.charAt(i)-desplazamiento);
		}
		return decodificado;
		
	}

}
