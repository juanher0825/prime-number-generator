package threads;

import ui.MatrixVisualizerWindowController;
import exceptions.OffTheLimitException;
import model.*;

public class PaintingField extends Thread {

	private MatrixVisualizerWindowController mv;

	private Generator a;

	private int contador;
	
	private int option;

	public PaintingField(MatrixVisualizerWindowController mv, int n , int o) throws OffTheLimitException {
		this.mv = mv;
		contador = 0;
		option = o;
		a = new Generator(n);
	}

	
	
	public void run() {
		if (option == 1) {
			System.out.println("Entra al Hilo" + " " + contador + mv.getN());
			while (contador <= mv.getN()) {

				try {
					System.out.println(contador);
					mv.paint(a.betwiseSieve(mv.getN()), mv.getButons());
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		}else if (option == 2) {
			System.out.println("Entra al Hilo" + " " + contador + mv.getN());
			while (contador <= mv.getN()) {

				try {
					System.out.println(contador);
					mv.paint(a.SieveOfSundaram(mv.getN()), mv.getButons());
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		}else if (option ==3) {
			System.out.println("Entra al Hilo" + " " + contador + mv.getN());
			while (contador <= mv.getN()) {

				try {
					System.out.println(contador);
					mv.paint(a.sieveOfEratosthenes(mv.getN()), mv.getButons());
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}
		}
	}

	/*
	 * public void run() { while(c) { r = mc.rigth(r); r = mc.left(r);
	 * 
	 * try { sleep(50); } catch (InterruptedException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */
}
