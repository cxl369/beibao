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
		int w = 10149;//表示背包的最大承重
		int n = weight.length;//表示物品的个数
		int[][] maxVal = new int[n + 1][w + 1];//v[i][j]表示在前i个物品中能够装入容量为j的背包中的最大价值
		int[][] mark = new int[n + 1][w + 1];//记录哪个物品被放进背包
		int c=0;//记录背包里的物品
		//初始化条件
		for (int i = 0; i < w + 1; i++) {
			maxVal[0][i] = 0;
		}
		for (int i = 0; i < n + 1; i++) {
			maxVal[i][0] = 0;
		}

		//动态规划

		for (int i = 1; i < maxVal.length; i++) {
			for (int j = 1; j < maxVal[i].length; j++) {
				if (weight[i - 1] > j) {
					//如果第i-1个物品(因为i从1开始)的重量小于当前背包重量
					maxVal[i][j] = maxVal[i - 1][j];
				} else {
					if (maxVal[i - 1][j] < value[i - 1] + maxVal[i - 1][j - weight[i - 1]]) {
						//如果上一次规划的最大价值小于当前物品的价值和上一次规划的重量减去当前物品重量的价值总和。
						maxVal[i][j] = value[i - 1] + maxVal[i - 1][j - weight[i - 1]];
						mark[i][j] = 1;//记录
					} else {
						maxVal[i][j] = maxVal[i - 1][j];
					}
				}
			}
		}
		//查看二维数组
		for (int[] arr : maxVal) {
			System.out.println(Arrays.toString(arr));
		}
		//列出最终方案
		int i = mark.length - 1;
		int j = mark[0].length - 1;
		for(c=0;c<3;c--) {
			while (i > 0 && j > 0) {
				if (mark[i][j] == 1) {
					System.out.println("第" + i + "个商品放入了背包");
					j -= weight[i - 1];
				}
				i--;
			}
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println( "总共花费：" + (timeEnd - timeStart)/1000+ "s" );
	}
}
