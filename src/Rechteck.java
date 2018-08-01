import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Rechteck {

	private float x, y;
	private JPanel ausgabepanel = new JPanel();
	
	public Rechteck(RechteckEingabe re) {
		
		x = re.getS1();
		y = re.getS2();
		
		JTextField ausgabef = new JTextField(Float.toString(flaeche()), 20);
		JTextField ausgabeu = new JTextField(Float.toString(umfang()), 20);
		
		// Ausgabepanel Rechteck
		ausgabepanel.setLayout(new GridLayout(0, 2));
		ausgabepanel.add(new Label("Fläche: "));
		ausgabepanel.add(ausgabef);
		ausgabepanel.add(new Label("Umfang: "));
		ausgabepanel.add(ausgabeu);

	}
	
	private float flaeche() {	
		
			return x * y;
	}
	
	private float umfang() {
		
		return x + x + y + y;
		
	}
	
	public JPanel getAusgabepanel() {
		return ausgabepanel;
	}
}
