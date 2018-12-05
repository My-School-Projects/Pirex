package com.group5;

import javax.swing.*;
import java.awt.*;

public class SearchView extends JPanel
{
	private JPanel queryBar;//will be the top bar that will hold user query and clear button
	private JTextField resultsFound;//will display the number of results found
	private JTextArea summaryText;
	private JTextArea opusText;
	//private ActionListener listener; just in case someone wants to add functionality
    
	public SearchView()//builds the view
    {
    	super();
    	setLayout(new BoxLayout(this, 1));
    	buildQueryBar();
    	buildSummaryText();
    	buildResultsFound();
    	buildOpusText();
    	JButton remove = new JButton("Remore Opus");
    	add(remove);
    }
    
    private void buildSummaryText() {
    	String output = String.format("%-30s %-22s %-8s %-50s\n","Author","Title","Page","Summary");
    	output += String.format("%-20s %-12s %-10s %-50s\n","Charles Dickens","Bleak House","276","Blah blah blah");
    	summaryText = new JTextArea();
    	summaryText.setText(output);
    	summaryText.setEditable(false);
    	summaryText.setBorder(BorderFactory.createEtchedBorder());
    	add(summaryText);
    }
    
    
    private void buildResultsFound() {
    	JPanel panel = new JPanel();
    	panel.setLayout(new FlowLayout());
    	resultsFound = new JTextField("Retrieved 1 document");
    	resultsFound.setBorder(null);
    	resultsFound.setBackground(null);
    	resultsFound.setPreferredSize(new Dimension(750, 50));
    	resultsFound.setMaximumSize( resultsFound.getPreferredSize() );
    	resultsFound.setEditable(false);

    	panel.add(resultsFound);
    	
    	add(panel);
    	
    }
    
    private void buildOpusText() {//builds the opus text field
    	opusText = new JTextArea();
    	JScrollPane scrollPane = new JScrollPane(opusText);
    	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    	scrollPane.setPreferredSize(new Dimension(750, 250));
    	opusText.setLineWrap(true);
    	scrollPane.setBorder(BorderFactory.createEtchedBorder());
    	opusText.setEditable(false);
    	add(scrollPane);
    }
    
    private void buildQueryBar() {//builds the query bar
    	queryBar = new JPanel();
    	queryBar.setLayout(new FlowLayout(FlowLayout.LEFT));
    	JTextField prompt = new JTextField("Query: ");
    	prompt.setBorder(null);
    	prompt.setBackground(null);
    	queryBar.add(prompt);
    	JTextField query = new JTextField();
    	query.setPreferredSize(new Dimension(600, 25));
    	queryBar.add(query);
    	JButton clear = new JButton("Clear");
    	queryBar.add(clear);
    	prompt.setEditable(false);
    	add(queryBar);
    }
    
}