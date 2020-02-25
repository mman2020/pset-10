package graphical;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import util.AddWord;
import util.RemoveWord;

public class Toolbar extends JPanel implements ActionListener {
	private JButton rmvBtn;
	private JButton addBtn;
	private TxtPnl txtPnl;
	private AddWord addWord;
	private RemoveWord removeWord;
	
	public Toolbar() {
		createButtons();
		showButtons();
	}
	
	/**
	 * @createButtons is where all the buttons are made and their methods assigned
	 */
	private void createButtons() {
		rmvBtn = new JButton("Remove");
		addBtn = new JButton("Add");
		
		rmvBtn.addActionListener(this);
		addBtn.addActionListener(this);
	}
	
	/**
	 * This function deals with the graphical parts of the button
	 */
	private void showButtons() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(addBtn);
		add(rmvBtn);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		addWord = new AddWord();
		removeWord = new RemoveWord();
		
		if (clicked == rmvBtn) {
			removeWord.removeWord(txtPnl);
			txtPnl.appendText("Remove word");
		} else if (clicked == addBtn) {
			addWord.addWord();
			txtPnl.appendText("Add word");
		}
	}

	public void setTextPanel(TxtPnl txtPnl) {
		this.txtPnl = txtPnl;
	}
	
}
