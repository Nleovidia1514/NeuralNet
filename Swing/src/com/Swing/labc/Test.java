package com.Swing.labc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import java.awt.ScrollPane;

public class Test {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction();
	private JProgressBar progressBar;
	private JTextArea textArea;
	private ScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 7, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(148, 7, 146, 14);
		frame.getContentPane().add(progressBar);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(6, 33, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(6, 59, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setAction(action_1);
		btnLoad.setBounds(165, 202, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		textArea = new JTextArea();
		textArea.setBounds(235, 58, 162, 132);
		frame.getContentPane().add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(380, 59, 17, 132);
		frame.getContentPane().add(scrollBar);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(380, 59, 17, 131);
		frame.getContentPane().add(scrollbar);
		
		scrollPane = new ScrollPane();
		scrollPane.setBounds(234, 55, 163, 141);
		frame.getContentPane().add(scrollPane);
		progressBar.setMaximum(200);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			for(int i=0;i<100;i++)
				for(int j=0;j<100;j++) {
					progressBar.setValue(progressBar.getValue()+1);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					textArea.append(i +" , "+ j+"\n" );
				}
					
		}
	}
}
