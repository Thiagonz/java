public class SwitchSimplesExemplo {
	public static void main(String args[]){
		char indice = "b";
		
		String resultado = "";

				switch (indice){
					case "a" : resultado += "a";
					case "b" : resultado += "b";
					case "c" : resultado += "c";
					default : resultado += "d";
				}
		system.out.println(resultado);
	}
}