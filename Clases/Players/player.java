package Clases.Players;

public class player {
	
	public player(){}
	
	public player(String nombre, String figura){
		this.nombre = nombre;
		if(figura.equals("x")){
			this.figura = this.x;
		}else{
			this.figura = this.o;
		}
		//this.figura = figura;
	}
	private String x = "  X  ";
	private String o = "  O  ";
	private String nombre;
	private String figura;
	
	
	//SETTERS
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setFigura(String figura){
		this.figura = figura;
	}
	
	//GETTERS
	public String getNombre(){
		return this.nombre;
	}
	public String getFigura(){
		return this.figura;
	}
    
}
