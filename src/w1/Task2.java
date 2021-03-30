package w1;
//任务2：能够绘制任意一组D{0-1}KP数据以重量为横轴、价值为纵轴的数据散点图；
import java.awt.*;
import java.awt.geom.*;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

//JFrame是构造一个初始时不可见的新窗体（绘制散点图）
public class Task2 extends JPanel {
	//主函数
	public static void main(String[] args) {
		JFrame dd = new JFrame();//JFrame是构造一个初始时不可见的新窗体
		dd.setVisible(true);//设置窗体可见，没有该语句，窗体将不可见，所以此语句必须存在
		dd.setSize(300,300);//设置窗体的大小为300*300像素大小
		dd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户单击窗口的关闭按钮时程序执行的操作
		dd.setLocation(200,200);//离显示屏上边缘200像素，里显示屏左边缘200像素
		dd.add(new Task2());//操作
	}

	//定义数组：分别表示重量和价值
	int[] shuju = {
			408,921,1329,11,998,1009,104,839,943,299,374,673,703,954,1657,425,950,1375,430,541,971,332,483,815,654,706,1360,956,992,1948,
			508,1021,1321,111,1098,1196,204,939,1107,399,474,719,803,1054,1781,525,1050,1362,530,641,903,432,583,894,754,806,1241,1056,1092,1545,
	};
	int ctd=10 ;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		//颜色
		Color c = new Color(200, 70, 0);//设置坐标轴的颜色
		g.setColor(c);
		super.paintComponent(g);

		g2.setStroke(new BasicStroke(Float.parseFloat("2.0F")));// 轴线粗度
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//去掉轴线上的锯齿
		int w = getWidth();//设置宽度
		int h  = getHeight();//设置长度

		// 绘制横坐标
		//四个数据分别表示：每两个数据表示一个点的横纵坐标
		g2.draw(new Line2D.Double(ctd, h-ctd, w-ctd, h-ctd));
		g2.draw(new Line2D.Double(w-ctd, h-ctd, w-ctd-5, h-ctd-5));
		g2.draw(new Line2D.Double(w-ctd, h-ctd, w-ctd-5, h-ctd+5));

		// 绘制纵坐标
		g2.draw(new Line2D.Double(ctd, ctd, ctd, h-ctd));
//		g2.draw(new Line2D.Double(ctd, h-ctd, ctd+5, h-ctd+5));
//		g2.draw(new Line2D.Double(ctd, h-ctd, ctd-5, h-ctd+5));


		double xInc = (double)(w - 2*ctd)/(shuju.length-1);
		double scale = (double)(h - 2*ctd)/getMax();
		// 散点的设置
		g2.setPaint(Color.blue);//设置颜色
		for(int i = 0; i < shuju.length; i++) {
			double x = ctd + i*xInc;
			double y = h - ctd - scale*shuju[i];
			g2.fill(new Ellipse2D.Double(x-2, y-2, 4, 4));
		}
	}

	public int getMax() {
		int max = -Integer.MAX_VALUE;
		for(int i = 0; i < shuju.length; i++) {
			if(shuju[i] > max)
				max = shuju[i];
		}
		return max;
	}
}
