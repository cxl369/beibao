package w1;
//任务2：能够绘制任意一组D{0-1}KP数据以重量为横轴、价值为纵轴的数据散点图；
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

//JFrame是构造一个初始时不可见的新窗体（绘制散点图）
public class Task2 extends JPanel {
	//主函数
	public static void main(String[] args) throws IOException {
		//文件读取部分
		long start = System.currentTimeMillis();//计算导入数据的时间
		File file = new File( "C:\\Users\\Administrator\\eclipse-workspace\\work02\\src\\txts\\idkp1-10.txt" ); //文件路径
		System.out.println("读取IDKP0:");
		FileReader fR = new FileReader(file);//文件读取
		LineNumberReader reader = new LineNumberReader(fR);//统计行号
		int now1 = 0 ;  
		int number1 = 6 ; //设置指定行数（价值）
		String txt= "" ;      //用来存储得到的不同的价值   
		while (txt != null ) {
			now1++;       
			txt = reader.readLine();//按行读取：读取每一行
			if (now1 == number1) {//当读取的行数=指定的行数，则输出改行的内容
				System.out.println( "The profit of itmes are（读取的价值如下）:" +"\n"+  txt + "\n" );
			}
		}
		reader.close();
		fR.close();//关闭文件
		FileReader fR2 = new FileReader(file);
		LineNumberReader reader2 = new LineNumberReader(fR2);
		int number2 = 8 ; //设置指定行数（重量）
		String txt2= "" ;     //用来存储得到的不同的重量
		int now2= 0 ;
		while (txt2 != null ) {
			now2++;
			txt2 = reader2.readLine();//按行读取：读取每一行
			if (now2 == number2) {//当读取的行数=指定的行数，则输出改行的内容
				System.out.println( "The weight of itmes are（读取的重量值如下）:" + "\n" + txt2 + "\n" );
			}
		}
		reader2.close();
		fR2.close();

		//绘制散点图
		JFrame dd = new JFrame();//JFrame是构造一个初始时不可见的新窗体
		dd.setVisible(true);//设置窗体可见，没有该语句，窗体将不可见，所以此语句必须存在
		dd.setSize(300,300);//设置窗体的大小为300*300像素大小
		dd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户单击窗口的关闭按钮时程序执行的操作
		dd.setLocation(200,200);//离显示屏上边缘200像素，里显示屏左边缘200像素
		dd.add(new Task2());//操作

		long end = System.currentTimeMillis();//程序的结束时间
		System.out.println( "总共花费：" + (end - start)+ "ms" );//计算花费的时间，此处时间为ms
	}

	//定义数组：分别表示重量和价值
	int[] shuju = {
			408,508,921,1021,1329,1021,11,998,1009,104,839,943,299,374,673,703,954,1657,425,950,1375,430,541,971,332,483,815,654,706,1360,956,992,1948,
			1321,111,1098,1196,204,939,1107,399,474,719,803,1054,1781,525,1050,1362,530,641,903,432,583,894,754,806,1241,1056,1092,1545,
	};
	int ctd=10 ;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		//设置颜色
		Color c = new Color(200, 70, 0);//设置坐标轴的颜色：红色
		g.setColor(c);
		super.paintComponent(g);

		g2.setStroke(new BasicStroke(Float.parseFloat("2.0F")));// 轴线粗度
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//去掉轴线上的锯齿
		int w = getWidth();//设置宽度
		int h  = getHeight();//设置长度

		// 绘制横坐标
		//四个数据分别表示：每两个数据表示一个点的横纵坐标
		g2.draw(new Line2D.Double(ctd, h-ctd, w-ctd, h-ctd));//横坐标：线
		g2.draw(new Line2D.Double(w-ctd, h-ctd, w-ctd-5, h-ctd-5));//横坐标：箭头
		g2.draw(new Line2D.Double(w-ctd, h-ctd, w-ctd-5, h-ctd+5));//横坐标：箭头

		// 绘制纵坐标
		g2.draw(new Line2D.Double(ctd, ctd, ctd, h-ctd));//纵坐标：线
//				g2.draw(new Line2D.Double(ctd, h-ctd, ctd+5, h-ctd+5));//纵坐标：箭头
//				g2.draw(new Line2D.Double(ctd, h-ctd, ctd-5, h-ctd+5));//纵坐标：箭头

		//x轴坐标
		final int ZL = 50;
		//for循环绘制坐标轴
		for (int i = ctd, j = 0; i <  w-ctd; i +=ZL, j +=ZL) {
			g.drawString(" " + j, i - 10, ctd - 10+h);
		}
		
		g.drawString("重量", w-ctd-5-10, h-ctd-5);

		//y轴坐标
		final int PRESS_INTERVAL = 30;
		for (int i =h-ctd, j = 0; i > h-ctd; i -= PRESS_INTERVAL, j += ZL) {
			g.drawString(j + " ", h-ctd+100 , i + 3+10);
		}
		g.drawString("价值", ctd - 5, ctd - 5);
		
		double han = (double)(w - 2*ctd)/(shuju.length-1);
		double gui= (double)(h - 2*ctd)/getMax();
		System.out.println("以下遍历每个点的横纵坐标：");
		// 散点的设置
		g2.setPaint(Color.blue);//设置颜色
		for(int i = 0; i < shuju.length; i++) {
			double x = ctd + i*han;
			double y = h - ctd - gui*shuju[i];
			g2.fill(new Ellipse2D.Double(x-2, y-2, 4, 4));
			Label xy=new Label();
//			xy.fill = "x="+x+", y="+y;
			System.out.print("(");
			System.out.print(x);
			System.out.print(",");
			System.out.print(y);
			System.out.println(")");
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
