import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Kreis {
	
	float pi = (float) Math.PI;
	public float r;
	JPanel ausgabepanel = new JPanel();
	
	public Kreis(KreisEingabe ke) {
		
		r = ke.getRadius();
		JTextField ausgabef2 = new JTextField(Float.toString(flaeche()), 20);
		JTextField ausgabeu2 = new JTextField(Float.toString(umfang()), 20);
		JTextField dm = new JTextField(Float.toString(durchmesser()), 20);
		
		// Ausgabepanel Kreis
		ausgabepanel.setLayout(new GridLayout(0, 2));
		ausgabepanel.add(new Label("Fläche: "));
		ausgabepanel.add(ausgabef2);
		ausgabepanel.add(new Label("Umfang: "));
		ausgabepanel.add(ausgabeu2);
		ausgabepanel.add(new Label("Durchmesser: "));
		ausgabepanel.add(dm);
	}
	
	public float flaeche() {	
		
			return (pi*(r*r));
			
	}
	
	public float umfang() {
		
		return (2*pi*r);
		
	}
	
	public float durchmesser() {
		
		return r*2;
		
	}

	public JPanel getAusgabepanel() {
		return ausgabepanel;
	}
}
