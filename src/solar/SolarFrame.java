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
	Planet Jupiter=new Planet(sun,"images/Jupiter.jpg",200,100,0.06);
	Planet Mars=new Planet(sun,"images/Mars.jpg",200,100,0.07);
	Planet Mercury=new Planet(sun,"images/Mercury.jpg",200,100,0.08);
	Planet moon=new Planet(sun,"images/moon.jpg",200,100,0.09);
	Planet Neptune=new Planet(sun,"images/Neptune.jpg",200,100,0.10);
	Planet Saturn=new Planet(sun,"images/Saturn.jpg",200,100,0.11);
	Planet Uranus=new Planet(sun,"images/Uranus.jpg",200,100,0.12);
	Planet Venus=new Planet(sun,"images/Venus.jpg",200,100,0.13);
	/*
	private double x=100;
	private double y=100;*/
	//TODO	不能同时赋值？
	@Override
	public void paint(Graphics g){
		g.drawImage(bg ,0,0,Constant.GAME_WIDTH,Constant.GAME_HEIGHT,null);
		sun.draw(g);
		earth.draw(g);
		Jupiter.draw(g);
		Mars.draw(g);
		Mercury.draw(g);
		Neptune.draw(g);
		moon.draw(g);
		Saturn.draw(g);
		Uranus.draw(g);
		Venus.draw(g);
		
	}
	/*===========================================*/
	public static void main(String[] args){
		new SolarFrame().lauchFrame();//改进
//	SolarFrame ex=new SolarFrame();
//	ex.lauchFrame();
	}
}
