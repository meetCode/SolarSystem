package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

public class Planet extends Star{
	//����ͼƬ��λ�ã����г��� ���� �ٶ� ���� 
	double longAxis; //����
	double shortAxis;//����
	double speed;	 //�����ٶ�
	double degree;
	Star center;
	
	@Override
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
		move();
	}
	public void move(){
		x=center.x+width/2+longAxis*Math.cos(degree);
		y=center.y+height/2+shortAxis*Math.sin(degree);//width,heightʹ�����Ķ��������Ͻ���ת
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
		super(imgpath, x, y);//TODO �̳и���  ��������ܲ���ֱ�������ã�
	}
}
