import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class RechteckEingabe extends Formeingabe {

	JPanel eingabepanel = new JPanel();
	JTextField s1 = new JTextField("", 20);
	JTextField s2 = new JTextField("", 20);

	public RechteckEingabe() {

		Label Seitenlaenge1 = new Label("Seitenlänge 1: ");
		Seitenlaenge1.setForeground(new Color(0, 0, 0));
		
		Label Seitenlaenge2 = new Label("Seitenlänge 2: ");
		Seitenlaenge2.setForeground(new Color(0, 0, 0));
		
		// Eingabepanel Rechteck
		eingabepanel.setLayout(new GridLayout(0, 2));
		eingabepanel.add(Seitenlaenge1);
		eingabepanel.add(s1);
		eingabepanel.add(Seitenlaenge2);
		eingabepanel.add(s2);
	}
	
	public Float getS1() {
		
		return Float.parseFloat(s1.getText());
	}
	
	public Float getS2() {
		return Float.parseFloat(s2.getText());
	}
	
	public JPanel getEingabepanel() {
		return eingabepanel;
	}
	
}
