
package Clases.Game;

import Clases.Players.player;

public class Gato{
	
	private String num1 = "  1  ";
	private String num2 = "  2  ";
	private String num3 = "  3  ";
	private String num4 = "  4  ";
	private String num5 = "  5  ";
	private String num6 = "  6  ";
	private String num7 = "  7  ";
	private String num8 = "  8  ";
	private String num9 = "  9  ";

	// private String x = "  X  ";
	// private String o = "  O  ";
	String[] originales = {"  1  ", "  2  ", "  3  ", "  4  ", "  5  ", "  6  ", "  7  ", "  8  ", "  9  "};
	String[] posiciones = {num1, num2, num3, num4, num5, num6, num7, num8, num9};

	private String escenario =
	posiciones[0] + "|" + posiciones[1] + "|" + posiciones[2] + "\n"
	+"-----|-----|-----\n"
	+posiciones[3] +"|" + posiciones[4] + "|" + posiciones[5] + "\n"
	+"-----|-----|-----\n"
	+posiciones[6] +"|" + posiciones[7] + "|" + posiciones[8] + "\n";
	
	//GETTERS
	public String getEscenario(){
		return this.escenario;
	}
	
	public String[] getOriginales(){
		return this.originales;
	}
	
	public String[] getPosiciones(){
		return this.posiciones;
	}
	
	
	public boolean verificar(int lugar){
		//System.out.println("Verificando el lugar: " + lugar);
		if (!posiciones[lugar].equals(originales[lugar])){
				return false;
		}else{
			return true;
		}
	}
	
	public void setLugar(int lugar, player p){
		//System.out.println("Colocando en el lugar: " + lugar);
		posiciones[lugar] = p.getFigura();
		setEscenario();
	}

	public void setEscenario() {
		this.escenario =
		posiciones[0] + "|" + posiciones[1] + "|" + posiciones[2] + "\n"
		+"-----|-----|-----\n"
		+posiciones[3] +"|" + posiciones[4] + "|" + posiciones[5] + "\n"
		+"-----|-----|-----\n"
		+posiciones[6] +"|" + posiciones[7] + "|" + posiciones[8] + "\n";
	}
	
	
	public boolean win(){
		if(posiciones[0].equals(posiciones[1]) && posiciones[1].equals(posiciones[2])){
			return true;
		}else if(posiciones[3].equals(posiciones[4]) && posiciones[4].equals(posiciones[5])){
			return true;
		}else if(posiciones[6].equals(posiciones[7]) && posiciones[7].equals(posiciones[8])){
			return true;
		}else if(posiciones[0].equals(posiciones[3]) && posiciones[3].equals(posiciones[6])){
			return true;
		}else if(posiciones[1].equals(posiciones[4]) && posiciones[4].equals(posiciones[7])){
			return true;
		}else if(posiciones[2].equals(posiciones[5]) && posiciones[5].equals(posiciones[8])){
			return true;
		}else if(posiciones[0].equals(posiciones[4]) && posiciones[4].equals(posiciones[8])){
			return true;
		}else if(posiciones[2].equals(posiciones[4]) && posiciones[4].equals(posiciones[6])){
			return true;
		}else{
			return false;
		}
	}

	public void printOriginales() {
		for (String original : originales) {
			System.out.print(original + " ");
		}
		System.out.println();
	}

	public void printPosiciones() {
		for (String posicion : posiciones) {
			System.out.print(posicion + " ");
		}
		System.out.println();
	}

}