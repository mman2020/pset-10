package app;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DefinitionViewer extends JPanel {
	
	public DefinitionViewer() {
		JPanel definitionWindow = new JPanel();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(definitionWindow), BorderLayout.CENTER);
	}
}
