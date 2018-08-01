import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {

	JFrame fenster = new JFrame();
	JButton button = new JButton("Rechne");
	JButton button2 = new JButton("Rechne");
	JPanel panel = new JPanel();
	JPanel ausgabepanel = new JPanel();
	Formeingabe f;
	
	public void start() {

		
		button.setSize(400, 20);
		button2.setSize(400, 20);
		
		// JComboBox / Pull-Down-Menü
		String Liste[] = {"Bitte Form auswählen","Rechteck", "Dreieck", "Kreis"};
		JComboBox<String> auswahl = new JComboBox<String>(Liste);
		auswahl.setSize(400, 20);

		// Fenster-Einstellungen
		fenster.setSize(500, 400);
		fenster.setTitle("Mathe-Tool");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setResizable(false);
		fenster.setLayout(new GridLayout(3, 1));
		fenster.add(auswahl);
		
		fenster.setVisible(true);
		
		auswahl.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				fenster.setVisible(false);
				fenster.remove(panel);
				fenster.remove(ausgabepanel);
				
				@SuppressWarnings("unchecked")
				JComboBox<String> box = (JComboBox<String>) e.getSource();
				String selected = (String) box.getSelectedItem();
				switch (selected) {
				
				case "Rechteck":
					
					System.out.println("Rechteck ausgewählt.");
					
					panel.removeAll();
					
					// Rechteck-Panel
					//System.out.println("before");
					f = new RechteckEingabe();
					panel.add(f.getEingabepanel());
					panel.add(button);
					//System.out.println("after");
					
					fenster.add(panel);					
					break;
					
				case "Dreieck":
					
					System.out.println("Dreieck ausgewählt.");
					
					break;
					
				case "Kreis":
					
					System.out.println("Kreis ausgewählt.");

					panel.removeAll();

					// Kreis-Panel
					f = new KreisEingabe();
					panel.add(f.getEingabepanel());
					panel.add(button2);
					
					fenster.add(panel);
					break;
					
				default:
				
				} 
				
				fenster.repaint();
				auswahl.hasFocus();
				fenster.setVisible(true);
			}
			
		});
		
		// Getter und Setter von Eingabe und Ergebnis
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Eventmethode();
			}
			
			private void Eventmethode() {
				Rechteck r = new Rechteck((RechteckEingabe)f);
				ausgabepanel = r.getAusgabepanel();
				fenster.setVisible(false);
				fenster.add(ausgabepanel);
				fenster.repaint();
				auswahl.hasFocus();
				fenster.setVisible(true);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Eventmethode();
			}

			private void Eventmethode() {
				Kreis k = new Kreis((KreisEingabe)f);
				ausgabepanel = k.getAusgabepanel();
				fenster.setVisible(false);
				fenster.add(ausgabepanel);
				fenster.repaint();
				auswahl.hasFocus();
				fenster.setVisible(true);
			}
		});
	}
	
}
