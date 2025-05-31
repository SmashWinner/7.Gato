package Clases;

import Clases.Game.Gato;
import Clases.Players.*;
import java.util.Scanner;


public class Systema {

    public Systema() {
        inicio();
    }

    public static void inicio(){
        boolean win = true;
		boolean flag = true;
		int lugar;
		Scanner sc = new Scanner(System.in);
		Gato game = new Gato();
		player player1 = new player("Smash", "x");
		bot player2 = new bot("BOT", "o");
		player[] players = { player1, player2 };
		do {
			for (player p : players) {
				do {
					System.out.println("Turno de " + p.getNombre() + " (" + p.getFigura().trim() + ")");
					System.out.println("Elige un lugar (1-9): ");
					System.out.println(game.getEscenario());

					if (p instanceof bot) {
						lugar = ((bot) p).elegirMovimiento();
					} else {
						lugar = sc.nextInt();
					}
					if (game.verificar(lugar - 1)) {
						game.setLugar(lugar - 1, p);
						limpiarPantalla();

						flag = false;
					} else {
						if (p instanceof bot) {

						} else {
							System.out.println("Este lugar ya esta ocupado");
						}
						flag = true;
					}
				} while (flag);
			if (game.win()) {
					System.out.println("Felicidades " + p.getNombre() + ", has ganado!");
					win = false;
					flag = false;
					System.out.println("------------------------------------------");
					System.out.println(game.getEscenario());
					break;
				}
			}
		} while (win);
		sc.close();
    }

    public static void limpiarPantalla() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				new ProcessBuilder("clear").inheritIO().start().waitFor();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
    
}
