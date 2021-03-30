package w1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
//任务1：可正确读入实验数据文件的有效D{0-1}KP数据；
public class Task1 { 
	 public static void main(String[] args) throws IOException {
         long start = System.currentTimeMillis();//计算导入数据的时间
         File file = new File( "C:\\Users\\Administrator\\eclipse-workspace\\work02\\src\\txts\\idkp1-10.txt" ); //文件路径
         FileReader fR = new FileReader(file);//文件读取
         LineNumberReader reader = new LineNumberReader(fR);//统计行号
         int now1 = 0 ;  
         int number1 = 6 ; //设置指定行数（价值）
         String txt= "" ;      //用来存储得到的不同的价      
         while (txt != null ) {
        	 now1++;
             txt = reader.readLine();
             if (now1 == number1) {
                 System.out.println( "The profit of itmes are（读取的价值如下）:" +"\n"+  txt + "\n" );
             }
         }
         reader.close();
         fR.close();
         FileReader fR2 = new FileReader(file);
         LineNumberReader reader2 = new LineNumberReader(fR2);
         int number2 = 8 ; //设置指定行数（重量）
         String txt2= "" ;     //用来存储得到的不同的重量
         int now2= 0 ;
         while (txt2 != null ) {
             now2++;
             txt2 = reader2.readLine();
             if (now2 == number2) {
                 System.out.println( "The weight of itmes are（读取的重量值如下）:" + "\n" + txt2 + "\n" );
             }
         }
         long end = System.currentTimeMillis();
         System.out.println( "总共花费：" + (end - start)+ "ms" );
         reader2.close();
         fR2.close();
     }
}
