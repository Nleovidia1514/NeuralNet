package com.Swing.labc;

import java.awt.Color;
import java.awt.GridLayout;
import javax.sound.midi.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.ListModel;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Main extends JFrame{
	
		public Main() {
			JList list = new JList();
			list.setSelectionMode(JList.VERTICAL);
			list.setModel(ListModel<>);
			this.getContentPane().add(list);
			this.setVisible(true);
		}
	
		public static void main(String[] args)  {    
			 Main idk = new Main();

		  }
		   
}
		


