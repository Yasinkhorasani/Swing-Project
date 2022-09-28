package de.karten.frontend;

import javax.swing.*;

/**
 * 
 * MeineKartenApp ist ein JFrame
 * 
 * 
 * 
 * @author Alfa
 *
 */
@SuppressWarnings("serial")
public class MeineKartenApp  extends JFrame{

	/**
	 * Container fuer JMenus
	 * Eine JMenuBar fuer einen Top-Level-Container: JFrame
	 */
	private JMenuBar leiste = new JMenuBar();
	
	/**
	 * Eintrag in die JMenuBar
	 */
	private JMenu datei = new JMenu("Datei");
	
	/**
	 * Eintrag in die JMenuBar.
	 * Hier Einträge zu den verschiedenen Layouts
	 * Beim Klick auf die Einträge werden die jeweiligen Layouts angezeigt
	 */
	private JMenu layout = new JMenu("Layout");
	
	/**
	 * Demosntriert das Aussehen von JMenu/JMenuItem
	 * Hat keine Funktion
	 */
	private JMenuItem speichern = new JMenuItem("Speichern");
	
	/**
	 * Aktuell keine Funktion
	 */
	private JMenuItem allesSpeichern = new JMenuItem("Alles Speichern");
	
	/**
	 * Hier kann die Anwendung beendet werden
	 * System.exit(0);
	 * JMenuItems lösen beim Klicken ein ActionEvent aus
	 * Übung
	 */
	private JMenuItem beenden = new JMenuItem("Beenden");
	
	/**...*/
	private JMenuItem grid = new JMenuItem("Grid Layout");
	private JMenuItem border = new JMenuItem("Border Layout");
	private JMenuItem flow = new JMenuItem("Flow Layout");
	private JMenuItem mix = new JMenuItem("Kombi aus Layouts");
	
	/**
	 * Tests mit JMenu...Übung: Auch mit How To Use
	 */
	private JMenu chemie = new JMenu("Experimente");
	
	/**
	 * Ein JTabbedPane, das in jedem Tabb ein anderes Layout vorstellt
	 */
	private Register hauptBereich = new Register();
	
	public MeineKartenApp() {
		//super();
		setTitle("Karten Karten Karten");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		menuBauen();
		hauptbereichBauen();
	}

	private void hauptbereichBauen() {
		this.add(hauptBereich);
		
	}

	/**
	 * Modularisiert den Inhalt des Konstruktors
	 * Überladene add-Methoden
	 * hier add(component) : Reihenfolge der Aufrufe der add-Methode entscheidet über 
	 * Reihnfolge der Anzeige der Komponenten
	 * this.setJMenuBar(leiste);: set heisst: eine JMenuBar pro JFrame
	 */
	private void menuBauen() {
		datei.add(speichern);
		datei.add(allesSpeichern);
		datei.add(beenden);
		
		layout.add(grid);
		layout.add(border);
		layout.add(flow);
		layout.add(mix);
		
		leiste.add(datei);
		leiste.add(layout);
		leiste.add(chemie);
		
		this.setJMenuBar(leiste);
	}
			
	
}
















