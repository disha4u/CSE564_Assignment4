package com.asu.cse.asssigments.project;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Drawable extends JPanel{
	
	double x,y;
	String cname="";
	int i=0;
	int xcoor1,ycoor1,xcoor2, ycoor2;
	public void setxy(double x,double y) {
		this.x=x;
		this.y=y;
		System.out.println("drawable "+x);
		System.out.println("drawable "+y);
		
	}
//	public void setXYLine(int xcoor1,int ycoor1,int xcoor2,int ycoor2)
//	{
//		
//	}
	public void settxt(String txt) {
		this.cname=txt;
	}
	
	Drawable()
	{
		
		//setBackground(Color.WHITE);
	}
	
	@Override
	public void paintComponent(Graphics g) {	
		super.paintComponent(g);
		
		Storage s = Storage.getInstance();
		Graphics2D graphics = (Graphics2D) g.create();
		for(int i=0;i<s.getclasssize();i++) {
			
			graphics.setColor(Color.YELLOW);
			graphics.fill(new Rectangle2D.Double(s.readclass(i).getx(), s.readclass(i).gety(),BoxDimesions.length, BoxDimesions.width));
			graphics.setColor(Color.BLACK);
			graphics.drawString(s.readclass(i).name, (int)s.readclass(i).xcoor, (int)(s.readclass(i).ycoor+BoxDimesions.width/2));
		}
			
//			if(true)//r.name.toLowerCase()=="inheritance")
//			{
//				relationship=new Compoisiton(new UndirectedAssociation());
//				relationship.draw(g, (int)s.readclass(i).xcoor, (int)(s.readclass(i).ycoor+BoxDimesions.width/2), (int)s.readclass(i).xcoor+100, (int)(s.readclass(i).ycoor+BoxDimesions.width/2)+100);

		
//			}
//		}	
		
//		System.out.println("Relation SHip size "+s.getRelationshipSize());
		for(int i=0;i<s.getRelationshipSize();i++)
		{	DrawConnections relationship;
			Relationship r=s.readrelationship(i);
			String firstclass=r.class1;
			String secondclass=r.class2;
			int x1=0;
			int y2=0;
			int x2=0;
			int y1=0;
			for(int j=0;j<s.getclasssize();j++)
			{
				if(s.readclass(j).name.equals(firstclass))
						{	
							x1=(int) s.readclass(j).xcoor+BoxDimesions.length/2;
							y1=(int) s.readclass(j).ycoor+BoxDimesions.length/2;
						}
				else if(s.readclass(j).name.equals(secondclass))
				{	x2=(int) s.readclass(j).xcoor+BoxDimesions.length/2;
					y2=(int) s.readclass(j).ycoor+BoxDimesions.length/2;
					
				}
				
			}
			System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+r.name+" "+r.class1+" "+r.class2);
			if(x1!=0 && x2!=0 && y1!=0 && y2!=0)
			{
				if(r.name.toLowerCase().equals("inheritance"))
				{
					relationship=new Inheritance(new UndirectedAssociation());
					//relationship.draw(g, (int)s.readclass(i).xcoor, (int)(s.readclass(i).ycoor+BoxDimesions.width/2), (int)s.readclass(i).xcoor+100, (int)(s.readclass(i).ycoor+BoxDimesions.width/2)+100);
//					x1=x1+30;
//					x2=x2+20;
//					y2=y2+20;
//					y1=y1+30;

					relationship.draw(g, x1,y1,x2,y2);
				}
				else if(r.name.toLowerCase().equals("composition"))
				{
					relationship=new Composition(new UndirectedAssociation());
	//			relationship.draw(g, (int)s.readclass(i).xcoor, (int)(s.readclass(i).ycoor+BoxDimesions.width/2), (int)s.readclass(i).xcoor-100, (int)(s.readclass(i).ycoor+BoxDimesions.width/2)-100);
//					x1=x1+5;
//					x2=x2+5;
//					y2=y2+5;
//					y1=y1+5;
					relationship.draw(g, x1,y1,x2,y2);
				
				}
				else if(r.name.toLowerCase().equals("association"))
				{
					relationship=new Association(new UndirectedAssociation());
	//			relationship.draw(g, (int)s.readclass(i).xcoor, (int)(s.readclass(i).ycoor+BoxDimesions.width/2), (int)s.readclass(i).xcoor+100, (int)(s.readclass(i).ycoor+BoxDimesions.width/2)-100);
					relationship.draw(g, x1,y1,x2,y2);
				
				}
				else
				{
					relationship=new UndirectedAssociation();
	//				relationship.draw(g, (int)s.readclass(i).xcoor, (int)(s.readclass(i).ycoor+BoxDimesions.width/2), (int)s.readclass(i).xcoor+100, (int)(s.readclass(i).ycoor+BoxDimesions.width/2)-100);
					relationship.draw(g, x1,y1,x2,y2);
//					x1=x1+10;
//					x2=x2+10;
//					y2=y2+10;
//					y1=y1+10;
				}
			}
		}
//			graphics.setColor(Color.GREEN);
//			Relationship r=s.readrelationship(i);
//			int x1=400;//r.class1.xcoor;
//			int y1=400;//r.class1.ycoor;
//			int x2=500;//r.class2.xcoor;
//			int y2=500;//r.class2.ycoor;
//			DrawConnections relationship;
//			if(true)//r.name.toLowerCase()=="inheritance")
//			{
//				relationship=new Inheritance(new UndirectedAssociation());
//				relationship.draw(g, 30, 40, 50, 50);
//			}
////		}
		this.repaint();
	}

}
