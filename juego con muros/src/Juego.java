import javax.swing.JFrame;
import javax.swing.JPanel;

public class Juego extends JPanel{
	public static void main(String[] args) {
		JFrame ventana = new JFrame ("movimiento con obstaculos");
		Juego game=new Juego();
		ventana.add(game);
	
	}
}
