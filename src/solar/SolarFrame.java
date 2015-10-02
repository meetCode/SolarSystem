package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.Constant;
import util.GameUtil;
import util.MyFrame;

public class SolarFrame extends MyFrame{
	Image bg=GameUtil.getImage("images/bg.jpg");
	Star sun=new Star("images/sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	Planet earth=new Planet(sun,"images/earth.jpg",200,100,0.05);
	/*
	private double x=100;
	private double y=100;*/
	//TODO	不能同时赋值？
	@Override
	public void paint(Graphics g){
		g.drawImage(bg ,0,0,Constant.GAME_WIDTH,Constant.GAME_HEIGHT,null);
		sun.draw(g);
		earth.draw(g);
		
	}
	/*===========================================*/
	public static void main(String[] args){
		new SolarFrame().lauchFrame();//改进
//	SolarFrame ex=new SolarFrame();
//	ex.lauchFrame();
	}
}
