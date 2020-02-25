package app;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class DictionaryWindow extends JFrame{
	
	/**
	 * I don't know why eclipse wants me to include this, but I will.
	 */
	private static final long serialVersionUID = 1L;
	private static DefinitionViewer definitionViewer;
	private static Toolbar toolbar;
	
	
	/**
	 * Creates the mainframe for the application
	 */
	public DictionaryWindow() {
		super("Joseph's Dictionary");
		setLayout(new GridBagLayout());
		GridBagConstraints gridLayout = new GridBagConstraints();
		
		showFrame();
		
		createDefinition();
		
		gridLayout.gridx = 1;
		gridLayout.gridy = 0;
		add(definitionViewer, gridLayout);
		
		makeToolbar();

		gridLayout.gridx = 0;
		gridLayout.gridy = 0;
		add(toolbar, gridLayout);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	/**
	 * @showFrame deals with the graphical aspects of the frame
	 */
	
	private void showFrame() {
		setSize(600, 500);
		setResizable(true);
		setVisible(true);
	}
	/**
	 * @makeToolbar creates the toolbar
	 */
	private void makeToolbar() {
		toolbar = new Toolbar();
	}
	
	/**
	 * @createTxtPnl - creates the text panel
	 */
	private void createDefinition() {
		definitionViewer = new DefinitionViewer();
	}
}