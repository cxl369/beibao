package w1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
//任务4：用户能够自主选择动态规划算法、回溯算法求解指定D{0-1} KP数据的最优解和求解时间（以秒为单位）；
public class Task4 { 
	public static void main(String[] args) throws IOException {		
		long timeStart = System.currentTimeMillis();
		File file = new File( "C:\\Users\\Administrator\\eclipse-workspace\\work02\\src\\txts\\idkp1-10.txt" ); //文件路径
		FileReader fileReader = new FileReader(file);
		LineNumberReader reader = new LineNumberReader(fileReader);
		int number1 = 6 ;        //设置指定需要读取的行数（价值）
		String txt = "";              //用来存储得到的不同的价值
		int lines = 0 ;
		while (txt != null ) {
			lines++;
			txt = reader.readLine();
			if (lines == number1) {
				System.out.println( "The profit of itmes are:" +  txt + "\n" );
			}
		}
		File file2 = new File( "C:\\Users\\Administrator\\eclipse-workspace\\work02\\src\\txts\\idkp1-10.txt" ); //文件路径
		FileReader fileReader2 = new FileReader(file2);
		LineNumberReader reader2 = new LineNumberReader(fileReader2);
		int number2 = 8 ; //设置指定行数（重量）
		String txt2= "" ;     //用来存储得到的不同的重量
		int lines2= 0 ;
		while (txt2 != null ) {
			lines2++;
			txt2 = reader2.readLine();
			if (lines2 == number2) {
				System.out.println( "The weight of itmes are:" + txt2 + "\n" );
			}
		}
		reader.close();
		fileReader.close();

		//利用动态规划算法解决0-1背包问题
		int value[]= {408,921,1329,11,998,1009,104,839,943,299,374,673,703,954,1657,425,950,1375,430,541,971,332,483,815,654,706,1360,956,992,1948};
		int weight []= {508,1021,1321,111,1098,1196,204,939,1107,399,474,719,803,1054,1781,525,1050,1362,530,641,903,432,583,894,754,806,1241,1056,1092,1545};
		int w = 10149;//背包容量
		int n = weight.length;//表示物品的个数
		int mvaluel[][] = new int[n + 1][w + 1];//最大价值
		int wup[][] = new int[n + 1][w + 1];//放入背包的物品
		int c=0;//记录背包里的物品
		//初始化
		for (int i = 0; i < w + 1; i++) {
			mvaluel[0][i] = 0;
		}
		for (int i = 0; i < n + 1; i++) {
			mvaluel[i][0] = 0;
		}

		//动态规划

		for (int i=1; i <mvaluel.length;i++) {
			for (int j=1; j < mvaluel[i].length; j++) {
				//如果物品的重量小于当前背包的容量
				if (weight[i - 1] > j) {
					mvaluel[i][j] = mvaluel[i - 1][j];
				} else {//如果物品的重量大于当前背包的容量
					//如果上一次最大价值<当前物品的价值+上一次重量-当前物品重量的价值总和。
					if (mvaluel[i - 1][j] < value[i - 1] + mvaluel[i - 1][j - weight[i - 1]]) {
						mvaluel[i][j] = value[i - 1] + mvaluel[i - 1][j - weight[i - 1]];
						wup[i][j] = 1;//将物品放入背包
					} else {
						mvaluel[i][j] = mvaluel[i - 1][j];
					}
				}
			}
		}
		//查看二维数组
		for (int arr[] : mvaluel) {
			System.out.println(Arrays.toString(arr));
		}
		//求出最优解
		int a = wup.length - 1;
		int b = wup[0].length - 1;
		for(c=0;c<3;c--) {//只在背包中放入三个物品
			while (a > 0 && b > 0) {
				if (wup[a][b] == 1) {
					System.out.println("将第" + a + "个商品放入了背包");
					 b=b- weight[a - 1];
				}
				a--;
			}
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println( "总共花费：" + (timeEnd - timeStart)/1000+ "s" );
	}
}
