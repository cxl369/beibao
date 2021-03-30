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
         
         
         
         
         System.out.println("读取IDKP1:");
         FileReader fR11 = new FileReader(file);//文件读取
         LineNumberReader reader11 = new LineNumberReader(fR11);//统计行号
         int now11 = 0 ;  
         int number11 = 14 ; //设置指定行数（价值）
         String txt11= "" ;      //用来存储得到的不同的价      
         while (txt11 != null ) {
        	 now11++;
             txt11 = reader11.readLine();
             if (now11 == number11) {
                 System.out.println( "The profit of itmes are（读取的价值如下）:" +"\n"+  txt11 + "\n" );
             }
         }
         reader11.close();
         fR11.close();
         FileReader fR12 = new FileReader(file);
         LineNumberReader reader12 = new LineNumberReader(fR12);
         int number12 = 16 ; //设置指定行数（重量）
         String txt12= "" ;     //用来存储得到的不同的重量
         int now12= 0 ;
         while (txt12 != null ) {
             now12++;
             txt12 = reader12.readLine();
             if (now12 == number12) {
                 System.out.println( "The weight of itmes are（读取的重量值如下）:" + "\n" + txt12 + "\n" );
             }
         }
         reader12.close();
         fR12.close();
         
         
         
         
         
         System.out.println("读取IDKP2:");
         FileReader fR21 = new FileReader(file);//文件读取
         LineNumberReader reader21 = new LineNumberReader(fR21);//统计行号
         int now21 = 0 ;  
         int number21 = 22 ; //设置指定行数（价值）
         String txt21= "" ;      //用来存储得到的不同的价      
         while (txt21 != null ) {
        	 now21++;
             txt21 = reader21.readLine();
             if (now21 == number21) {
                 System.out.println( "The profit of itmes are（读取的价值如下）:" +"\n"+  txt21 + "\n" );
             }
         }
         reader21.close();
         fR21.close();
         FileReader fR22 = new FileReader(file);
         LineNumberReader reader22 = new LineNumberReader(fR22);
         int number22 = 24 ; //设置指定行数（重量）
         String txt22= "" ;     //用来存储得到的不同的重量
         int now22= 0 ;
         while (txt12 != null ) {
             now22++;
             txt12 = reader12.readLine();
             if (now22 == number22) {
                 System.out.println( "The weight of itmes are（读取的重量值如下）:" + "\n" + txt22 + "\n" );
             }
         }
         reader22.close();
         fR22.close();
         
         
         
         System.out.println("读取IDKP3:");
         FileReader fR31 = new FileReader(file);//文件读取
         LineNumberReader reader31 = new LineNumberReader(fR31);//统计行号
         int now31 = 0 ;  
         int number31 = 30 ; //设置指定行数（价值）
         String txt31= "" ;      //用来存储得到的不同的价      
         while (txt31 != null ) {
        	 now31++;
             txt31 = reader31.readLine();
             if (now31 == number31) {
                 System.out.println( "The profit of itmes are（读取的价值如下）:" +"\n"+  txt31 + "\n" );
             }
         }
         reader31.close();
         fR31.close();
         FileReader fR32 = new FileReader(file);
         LineNumberReader reader32 = new LineNumberReader(fR32);
         int number32 = 32 ; //设置指定行数（重量）
         String txt32= "" ;     //用来存储得到的不同的重量
         int now32= 0 ;
         while (txt32 != null ) {
             now32++;
             txt32 = reader32.readLine();
             if (now32 == number32) {
                 System.out.println( "The weight of itmes are（读取的重量值如下）:" + "\n" + txt32 + "\n" );
             }
         }
         reader32.close();
         fR32.close();
         
         long end = System.currentTimeMillis();
         System.out.println( "总共花费：" + (end - start)+ "ms" );
         
     }
}
