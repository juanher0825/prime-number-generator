package threads;

import ui.MatrixVisualizerWindowController;
import exceptions.OffTheLimitException;
import model.*;

public class PaintingField extends Thread{

	private MatrixVisualizerWindowController mv;
	
	private Generator a;
	
	private int contador;
	
	
	public PaintingField(MatrixVisualizerWindowController mv, int n) throws OffTheLimitException {
		this.mv = mv;
		contador = 0;
		a = new Generator(n);
	}
	
	public void run() {
		System.out.println("Entra al Hilo" + " " + contador + mv.getN());
		while(contador <= mv.getN()) {
			System.out.println(contador);
			mv.paint(a.betwiseSieve(mv.getN()), mv.getButons());
			try {
				sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			
		}
		}
	}
	
	/*public void run() {
		while(c) {
			r = mc.rigth(r);
			r = mc.left(r);
			
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}*/
}
