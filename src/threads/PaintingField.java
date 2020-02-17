package threads;

import ui.MatrixVisualizerWindowController;
import exceptions.BelowTheLimitException;
import exceptions.OffTheLimitException;
import model.*;

public class PaintingField extends Thread {

	private MatrixVisualizerWindowController mv;

	private Generator a;

	private int contador;
	
	private int option;
	
	private boolean flag;
	
	public PaintingField(MatrixVisualizerWindowController mv, int n , int o) throws OffTheLimitException, BelowTheLimitException {
		this.mv = mv;
		contador = 0;
		option = o;
		flag = true;
		a = new Generator(n);
	}

	
	
	public void run() {
		if (option == 1) {
			System.out.println("Entra al Hilo" + " " + contador + mv.getN());
			
			

				
					System.out.println(contador);
					mv.paint(a.betwiseSieve(mv.getN()), mv.getButons());
					
			
			
			
		}else if (option == 2) {
			System.out.println("Entra al Hilo" + " " + contador + mv.getN());
			

				
					System.out.println(contador);
					mv.paint(a.SieveOfSundaram(mv.getN()), mv.getButons());
					
			
		}else if (option ==3) {
			System.out.println("Entra al Hilo" + " " + contador + mv.getN());
			

				
					System.out.println(contador);
					mv.paint(a.sieveOfEratosthenes(mv.getN()), mv.getButons());
				
				
			}
		
	}

	
}
