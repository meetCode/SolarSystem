package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.Constant;
import util.GameUtil;
import util.MyFrame;

public class SolarFrame extends MyFrame{
	Image bg=GameUtil.getImage("images/bg.jpg");
	Star sun=new Star("images/sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	Planet Mercury=new Planet(sun,"images/Mercury.jpg",100,50,0.13);//ˮ��
	Planet Venus=new Planet(sun,"images/Venus.jpg",150,100,0.12);//����
	Planet earth=new Planet(sun,"images/earth.jpg",200,150,0.11);//��
	Planet moon=new Planet(earth,"images/moon.jpg",50,30,0.15);
	Planet Mars=new Planet(sun,"images/Mars.jpg",250,200,0.1);//����
	Planet Jupiter=new Planet(sun,"images/Jupiter.jpg",260,210,0.09);//ľ��
	Planet Saturn=new Planet(sun,"images/Saturn.jpg",270,220,0.07);//����
	Planet Uranus=new Planet(sun,"images/Uranus.jpg",280,230,0.03);//������
	Planet Neptune=new Planet(sun,"images/Neptune.jpg",300,250,0.01);//������
	
	
	
	/*
	private double x=100;
	private double y=100;*/
	//TODO	����ͬʱ��ֵ��
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
		new SolarFrame().lauchFrame();//�Ľ�
//	SolarFrame ex=new SolarFrame();
//	ex.lauchFrame();
	}
}
