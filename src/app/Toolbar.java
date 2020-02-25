package app;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Toolbar extends JPanel implements ActionListener {
	/**
	 * Eclipse told me to add this
	 */
	private static final long serialVersionUID = 1L;
	private JButton rmvBtn;
	private JButton addBtn;
	private JTextField searchBar;
	private JRadioButton ascending;
	private JRadioButton descending;
	private JScrollPane wordViewer;
	private GridBagConstraints gridLayout;
	
	public Toolbar() {
		//I only want two columns for the grid
		gridLayout = new GridBagConstraints();
		
		gridLayout.weightx = 1;
		gridLayout.weighty = 1;
		gridLayout.fill = GridBagConstraints.HORIZONTAL;
		gridLayout.gridx = 0;
		gridLayout.gridy = 0;
		
		createButtons();
	
		add(addBtn, gridLayout);
		add(rmvBtn, gridLayout);
		
		createSearchBar();
		
		gridLayout.gridx = 1;
		gridLayout.gridy = 1;
		
		add(searchBar, gridLayout);
		
		createAscending();
		
		createDescending();
		
		gridLayout.gridx = 2;
		gridLayout.gridy = 0;
		
		showAscending();
		
		showDescending();
		
		createWordViewer();
		
		showWordViewer();
	}
	
	/**
	 * @createWordViewer makes the word viewer
	 */
	
	private void createWordViewer() {
		wordViewer = new JScrollPane();
		wordViewer.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(wordViewer);
	}
	
	/**
	 * @showWordViewer deals with the graphical components of the word viewer
	 */
	
	private void showWordViewer() {
		add(wordViewer);
	}
	
	/**
	 * @createDescending makes the descending button
	 */
	
	private void createDescending() {
		descending = new JRadioButton("Desc");
	}
	
	/**
	 * @showDescending shows the descending button
	 */
	
	private void showDescending() {
		add(descending);
	}
	
	/**
	 * @createAscending makes the ascending button
	 */
	private void createAscending() {
		ascending = new JRadioButton("Asc");
	}
	
	/**
	 * @showAscending deals with the graphics
	 */
	private void showAscending() {
		add(ascending, BorderLayout.CENTER);
	}
	
	/**
	 * @createSearchBar the searchbar is made here and given functionality
	 */
	private void createSearchBar() {
		searchBar = new JTextField("Search");
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
	
	public void actionPerformed(ActionEvent e) {
		//getText function can get the text in a search bar
		JButton clicked = (JButton) e.getSource();
		
	}
}
