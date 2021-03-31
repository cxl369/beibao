package w1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Arrays;
//任务3：能够对一组D{0-1}KP数据按项集第三项的价值:重量比进行非递增排序；
public class Task3 {
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
		//价值，重量比进行非递增排序
		double value[]= {408,921,1329,11,998,1009,104,839,943,299,374,673,703,954,1657,425,950,1375,430,541,971,332,483,815,654,706,1360,956,992,1948};
		double weight []= {508,1021,1321,111,1098,1196,204,939,1107,399,474,719,803,1054,1781,525,1050,1362,530,641,903,432,583,894,754,806,1241,1056,1092,1545};
		double[] rate = new double[value.length];
		for(int i=0;i<value.length;i++){ 
			double jiazhi = value[i]/weight[i];
			rate[i] = jiazhi;
		}
		//价值：重量比结果：
		System.out.println("两个数组【价值】/【重量】的结果：");
		for(int i=0;i<rate.length;i++) {
			System.out.println(rate[i]);
		}
		quick(rate, value, weight, 0, rate.length-1); //快速排序
		//价值：重量比进行非递增排序：
		System.out.println("【价值】/【重量】进行非递增排序:");
		for(int i=0;i<rate.length;i++) {
			System.out.println(rate[i]);
		}
		System.out.println("使用数组输出快速排序之后的结果");
		System.out.println(Arrays.toString(rate));//将排序之后的结果以数组的方式列出
	}
	//快速排序具体的过程
	public static void quick(double[] rate, double[] value, double[] weight, int sta, int end){
		if(sta<end){
			int cent = partition(rate, value, weight, sta, end);//在数组中的中心位置的点：cent
			quick(rate, value, weight, sta, cent-1);//对数组中的前半部分进行排序
			quick(rate, value, weight, cent+1, end);//对数组中的后半部分进行排序
		}
	}
	//快速排序交换过程
	public static int partition(double[] rate, double[] value, double[] weight, int sta, int end){
		double temp ;
		for(int i=sta;i<=end;i++){
			if(rate[i]>rate[end]){
				temp = rate[i];
				rate[i] = rate[sta];
				rate[sta] = temp;	
				sta ++;
			}
		}
		temp = rate[sta];
		rate[sta] = rate[end];
		rate[end] = temp;

		return sta;
	}
}
