import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame{
	
	public VentanaInicio() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Programa GUI [Layout Nulo]");
		setSize(771,580);
		setLocationRelativeTo(null);
	}
}

public class PruebaGUI {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}

}
