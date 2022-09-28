package de.karten.frontend;

import java.awt.Color;

import javax.swing.*;
/**
 * Diese Klasse erstellt einen Bereich, der in der Fensterapp angezeigt wird.
 * Sie erstellt eine Komponente
 * 
 * Diese Komponente ist ein Container: Sie kann weitere Komponenten enthalten
 * Enthaltene Komponenten müssen organisiert werden:
 * Eine Möglichkeit: setLayout beauftragt einen Layout Manager
 * Zweite Möglichkeit: Pane. Panes haben ein festgelegtes Layout. Hier JTabbedPane
 * (in JavaFX alle über Pane)
 * 
 * Ein Tabb soll mehrere Komponenten enthalten: JPanel
 * @author Alfa
 *
 */
@SuppressWarnings("serial")
public class Register extends JTabbedPane{
 
	private JPanel rot = new JPanel();//Platzhalter für: JPanel mit Grid-Layout
	private JPanel gelb = new JPanel(); //Platzhalter für: JPanel mit Border-Layout
	private JPanel blau = new JPanel();//Platzhalter für JPanel mit FlowLayout
	private JPanel mischmasch = new JPanel(); //Platzhalter für JPanel mit einem gemoischten Layout
	
	public Register() {
//		demostriertJTabbedPane();
		bauen();
	}

	private void bauen() {
		rot.setBackground(Color.RED);
		gelb.setBackground(Color.YELLOW);
		blau.setBackground(Color.BLUE);
		mischmasch.setBackground(new Color(127,0,127));
		
		add("Rot", rot);
		add("Gelb", gelb);
		add("Blau", blau);
		add("Mix", mischmasch);
	}

	/**
	 * Wird später nicht verwendet
	 * Dient zur Demonstration der Funktionalität des JTabbedPanes
	 * Verwendet ein add-Methode mit Zusatzinformation, hier Reiter-Beschriftung
	 * this.add(new JTextField("Ich bin die Nummer 1"),0);add-Methode im Zahl: Index der Position
	 */
	private void demostriertJTabbedPane() {
		this.add(new JButton("Ich seh komisch aus"),"Button");
		this.add(new JTextField("Ich bin die Nummer 1"),0);
		this.add(new JLabel("Wähle weise"),"Anzeige");
		this.add("Jetzt mit Sinn", new JTextArea("Zeile 1\nZeile 2\nZeile 3"));
	}
}


//Beenden der Anwendung über JMenuItem beenden

/*
* In diesem Projekt!
* MIT JAVA DOC!
* Kein How to use! Kein Google!
* 
* JMenuItems grid, border, flow und mix sollen beim Klicken (ActionEvent)
* die entsprechende Registerkarte anzeigen: Rot/Gelb/Blau/Mix
* 2 Arten/2 Methoden (Aus Javadoc) 
* 
* Experimente mit der Experimente (gerne auch mit How to Use)
*/




