package w1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
//浠诲姟1锛氬彲姝ｇ‘璇诲叆瀹為獙鏁版嵁鏂囦欢鐨勬湁鏁圖{0-1}KP鏁版嵁锛�
public class Task1 { 
	 public static void main(String[] args) throws IOException {
         long start = System.currentTimeMillis();//璁＄畻瀵煎叆鏁版嵁鐨勬椂闂�
         File file = new File( "C:\\Users\\Administrator\\eclipse-workspace\\work02\\src\\txts\\idkp1-10.txt" ); //鏂囦欢璺緞
         System.out.println("璇诲彇IDKP0:");
         FileReader fR = new FileReader(file);//鏂囦欢璇诲彇
         LineNumberReader reader = new LineNumberReader(fR);//缁熻琛屽彿
         int now1 = 0 ;  
         int number1 = 6 ; //璁剧疆鎸囧畾琛屾暟锛堜环鍊硷級
         String txt= "" ;      //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑浠峰��   
         while (txt != null ) {
        	 now1++;       
             txt = reader.readLine();//鎸夎璇诲彇锛氳鍙栨瘡涓�琛�
             if (now1 == number1) {//褰撹鍙栫殑琛屾暟=鎸囧畾鐨勮鏁帮紝鍒欒緭鍑烘敼琛岀殑鍐呭
                 System.out.println( "The profit of itmes are锛堣鍙栫殑浠峰�煎涓嬶級:" +"\n"+  txt + "\n" );
             }
         }
         reader.close();
         fR.close();//鍏抽棴鏂囦欢
         FileReader fR2 = new FileReader(file);
         LineNumberReader reader2 = new LineNumberReader(fR2);
         int number2 = 8 ; //璁剧疆鎸囧畾琛屾暟锛堥噸閲忥級
         String txt2= "" ;     //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑閲嶉噺
         int now2= 0 ;
         while (txt2 != null ) {
             now2++;
             txt2 = reader2.readLine();//鎸夎璇诲彇锛氳鍙栨瘡涓�琛�
             if (now2 == number2) {//褰撹鍙栫殑琛屾暟=鎸囧畾鐨勮鏁帮紝鍒欒緭鍑烘敼琛岀殑鍐呭
                 System.out.println( "The weight of itmes are锛堣鍙栫殑閲嶉噺鍊煎涓嬶級:" + "\n" + txt2 + "\n" );
             }
         }
         reader2.close();
         fR2.close();
         
         
         
         
         System.out.println("璇诲彇IDKP1:");
         FileReader fR11 = new FileReader(file);//鏂囦欢璇诲彇
         LineNumberReader reader11 = new LineNumberReader(fR11);//缁熻琛屽彿
         int now11 = 0 ;  
         int number11 = 14 ; //璁剧疆鎸囧畾琛屾暟锛堜环鍊硷級
         String txt11= "" ;      //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑浠�      
         while (txt11 != null ) {
        	 now11++;
             txt11 = reader11.readLine();
             if (now11 == number11) {
                 System.out.println( "The profit of itmes are锛堣鍙栫殑浠峰�煎涓嬶級:" +"\n"+  txt11 + "\n" );
             }
         }
         reader11.close();
         fR11.close();
         FileReader fR12 = new FileReader(file);
         LineNumberReader reader12 = new LineNumberReader(fR12);
         int number12 = 16 ; //璁剧疆鎸囧畾琛屾暟锛堥噸閲忥級
         String txt12= "" ;     //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑閲嶉噺
         int now12= 0 ;
         while (txt12 != null ) {
             now12++;
             txt12 = reader12.readLine();
             if (now12 == number12) {
                 System.out.println( "The weight of itmes are锛堣鍙栫殑閲嶉噺鍊煎涓嬶級:" + "\n" + txt12 + "\n" );
             }
         }
         reader12.close();
         fR12.close();
         
         
         
         
         
         System.out.println("璇诲彇IDKP2:");
         FileReader fR21 = new FileReader(file);//鏂囦欢璇诲彇
         LineNumberReader reader21 = new LineNumberReader(fR21);//缁熻琛屽彿
         int now21 = 0 ;  
         int number21 = 22 ; //璁剧疆鎸囧畾琛屾暟锛堜环鍊硷級
         String txt21= "" ;      //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑浠�      
         while (txt21 != null ) {
        	 now21++;
             txt21 = reader21.readLine();
             if (now21 == number21) {
                 System.out.println( "The profit of itmes are锛堣鍙栫殑浠峰�煎涓嬶級:" +"\n"+  txt21 + "\n" );
             }
         }
         reader21.close();
         fR21.close();
         FileReader fR22 = new FileReader(file);
         LineNumberReader reader22 = new LineNumberReader(fR22);
         int number22 = 24 ; //璁剧疆鎸囧畾琛屾暟锛堥噸閲忥級
         String txt22= "" ;     //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑閲嶉噺
         int now22= 0 ;
         while (txt12 != null ) {
             now22++;
             txt12 = reader12.readLine();
             if (now22 == number22) {
                 System.out.println( "The weight of itmes are锛堣鍙栫殑閲嶉噺鍊煎涓嬶級:" + "\n" + txt22 + "\n" );
             }
         }
         reader22.close();
         fR22.close();
         
         
         
         System.out.println("璇诲彇IDKP3:");
         FileReader fR31 = new FileReader(file);//鏂囦欢璇诲彇
         LineNumberReader reader31 = new LineNumberReader(fR31);//缁熻琛屽彿
         int now31 = 0 ;  
         int number31 = 30 ; //璁剧疆鎸囧畾琛屾暟锛堜环鍊硷級
         String txt31= "" ;      //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑浠�      
         while (txt31 != null ) {
        	 now31++;
             txt31 = reader31.readLine();
             if (now31 == number31) {
                 System.out.println( "The profit of itmes are锛堣鍙栫殑浠峰�煎涓嬶級:" +"\n"+  txt31 + "\n" );
             }
         }
         reader31.close();
         fR31.close();
         FileReader fR32 = new FileReader(file);
         LineNumberReader reader32 = new LineNumberReader(fR32);
         int number32 = 32 ; //璁剧疆鎸囧畾琛屾暟锛堥噸閲忥級
         String txt32= "" ;     //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑閲嶉噺
         int now32= 0 ;
         while (txt32 != null ) {
             now32++;
             txt32 = reader32.readLine();
             if (now32 == number32) {
                 System.out.println( "The weight of itmes are锛堣鍙栫殑閲嶉噺鍊煎涓嬶級:" + "\n" + txt32 + "\n" );
             }
         }
         reader32.close();
         fR32.close();
         
         long end = System.currentTimeMillis();
         System.out.println( "本程序所使用的时间为：" + (end - start)+ "ms" );
         
     }
}
