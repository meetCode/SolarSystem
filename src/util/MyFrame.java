package util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import test.GameFrame03.PaintThread;

public class MyFrame extends Frame{
	public static final int GAME_WIDTH=500;
	public static final int GAME_HEIGH=500;
	public void lauchFrame(){
		setSize(GAME_WIDTH,GAME_HEIGH);
		setLocation(100,100);
		setVisible(true);
		
		
		new PaintThread().start();//Æô¶¯Ïß³Ì
		
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
	}
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
