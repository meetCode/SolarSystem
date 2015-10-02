package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

public class Star {
	Image img;
	double x,y;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	//¹¹ÔìÆ÷
	public Star(String imgpath,double x,double y){
		this.img=GameUtil.getImage(imgpath);
		this.x=x;
		this.y=y;
	}
}
