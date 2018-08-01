import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class KreisEingabe extends Formeingabe {

	JPanel eingabepanel = new JPanel();
	JTextField radius = new JTextField("", 20);
	Label lradius = new Label("Radius: ");
	
	public KreisEingabe() {		
		// Eingabepanel Kreis
		eingabepanel.setLayout(new GridLayout(0, 2));
		eingabepanel.add(lradius);
		eingabepanel.add(radius);
	}

	public float getRadius() {
		return Float.parseFloat(radius.getText());
	}
	
	public JPanel getEingabepanel() {
		return eingabepanel;
	}
}
