package com.Swing.labc;

import java.awt.Color;
import java.awt.GridLayout;
import javax.sound.midi.*;
import javax.sound.sampled.AudioInputStream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Main{
	/*JTextField tf1,tf2,tf3;  
    JButton b1,b2;  
    Main(){  
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        b1=new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b2=new JButton("-");  
        b2.setBounds(120,200,50,50);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);  
        f.setSize(300,300);
        f.setLayout(new GridLayout(4,8));  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  */
		public static void main(String[] args) throws IOException {    
		JFrame f = new JFrame();
		JTextField tf = new JTextField();
		tf.setEditable(true);
		tf.setForeground(Color.black);
		tf.setBackground(Color.black);
		JScrollBar sb = new JScrollBar();
		sb.setForeground(Color.white);
		sb.setBackground(Color.WHITE);
		sb.setBounds(300, 150, 25, 360);
		sb.setVisible(true);
		tf.setBounds(300,150,700,360);
		f.add(tf);f.add(sb);
		f.setTitle(new File("").toString());
		f.setVisible(true);
		f.setLocation(50, 50);
		f.setBounds(300,150,700,360);;
			}
		
			
			/*String perreo = "zelda.wav";
			InputStream in = new FileInputStream("hey.wav");
			AudioStream audio = new AudioStream(in);
			AudioPlayer.player.start(audio);
			audio.close();*/
			
		}    
		
	


