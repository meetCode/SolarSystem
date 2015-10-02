package solar;

import java.awt.Graphics;
import java.awt.Image;
import util.GameUtil;
import util.MyFrame;

public class SolarFrame extends MyFrame{
	Image img=GameUtil.getImage("images/sun.jpg");
	private double degree=3.14/3;
	private double speed=15;
	private double x=100;
	private double y=100;
	//TODO	不能同时赋值？
	@Override
	public void paint(Graphics g){

		g.drawImage(img, (int)x,(int)y,null);
		//System.out.println(x+"*"+y);
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		if(y<0||y>450) degree=-degree;
		if(x<0||x>450) degree=Math.PI-degree;
	}
	/*===========================================*/
	public static void main(String[] args){
	SolarFrame ex=new SolarFrame();
	ex.lauchFrame();
	}
}
