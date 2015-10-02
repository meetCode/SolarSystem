package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.Constant;
import util.GameUtil;
import util.MyFrame;

public class SolarFrame extends MyFrame{
	Star sun=new Star("images/sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	Image bg=GameUtil.getImage("images/bg.jpg");
	/*
	private double x=100;
	private double y=100;*/
	//TODO	不能同时赋值？
	@Override
	public void paint(Graphics g){
		g.drawImage(bg ,0,0,Constant.GAME_WIDTH,Constant.GAME_HEIGHT,null);//TODO bug:GAME_HETGHT用不了
		sun.draw(g);
		
	}
	/*===========================================*/
	public static void main(String[] args){
		new SolarFrame().lauchFrame();//改进
//	SolarFrame ex=new SolarFrame();
//	ex.lauchFrame();
	}
}
