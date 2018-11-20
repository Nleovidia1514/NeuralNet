package com.Swing.labc;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public enum SoundEffect {
	GONG("listen.wav"),
	DEATH("Ms_Pacman_Death.wav");
	
	private Clip clip;
	SoundEffect(String string){
		try {
			AudioInputStream audio = AudioSystem.getAudioInputStream(new File(string));
			clip = AudioSystem.getClip();
			clip.open(audio);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	public void play() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
}
