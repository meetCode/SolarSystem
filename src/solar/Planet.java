package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

public class Planet extends Star{
	//除了图片，位置；还有长轴 短轴 速度 中心 
	double longAxis; //长轴
	double shortAxis;//短轴
	double speed;	 //飞行速度
	double degree;
	Star center;
	
	@Override
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
		move();
	}
	public void move(){
		x=center.x+width/2+longAxis*Math.cos(degree);
		y=center.y+height/2+shortAxis*Math.sin(degree);//width,height使绕中心而不是左上角旋转
		degree+=speed;
	}
	
	public Planet(Star center,String imgpath, double longAxis, double shortAxis, double speed) {
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.x=center.x+longAxis;
		this.y=center.y;
		this.img=GameUtil.getImage(imgpath);
		this.speed = speed;
		this.center = center;
	}


	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);//TODO 继承父类  父类变量能不能直接拿来用？
	}
}
