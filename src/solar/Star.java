package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

public class Star {
	Image img;
	double x,y;
	int width,height;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	//������
	public Star(Image img){
		this.img=img;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	public Star(Image img,double x,double y){
		this(img);//TODO this
		this.x=x;
		this.y=y;
	}
	public Star(String imgpath,double x,double y){
		this(GameUtil.getImage(imgpath),x,y);
	}
	public Star(){}	//TODO why? ===>super();
}
