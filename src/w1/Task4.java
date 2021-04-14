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
//浠诲姟4锛氱敤鎴疯兘澶熻嚜涓婚�夋嫨鍔ㄦ�佽鍒掔畻娉曘�佸洖婧畻娉曟眰瑙ｆ寚瀹欴{0-1} KP鏁版嵁鐨勬渶浼樿В鍜屾眰瑙ｆ椂闂达紙浠ョ涓哄崟浣嶏級锛�
public class Task4 { 
	public static void main(String[] args) throws IOException {		
		long timeStart = System.currentTimeMillis();
		File file = new File( "C:\\Users\\Administrator\\eclipse-workspace\\work02\\src\\txts\\idkp1-10.txt" ); //鏂囦欢璺緞
		FileReader fileReader = new FileReader(file);
		LineNumberReader reader = new LineNumberReader(fileReader);
		int number1 = 6 ;        //璁剧疆鎸囧畾闇�瑕佽鍙栫殑琛屾暟锛堜环鍊硷級
		String txt = "";              //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑浠峰��
		int lines = 0 ;
		while (txt != null ) {
			lines++;
			txt = reader.readLine();
			if (lines == number1) {
				System.out.println( "The profit of itmes are:" +  txt + "\n" );
			}
		}
		File file2 = new File( "C:\\Users\\Administrator\\eclipse-workspace\\work02\\src\\txts\\idkp1-10.txt" ); //鏂囦欢璺緞
		FileReader fileReader2 = new FileReader(file2);
		LineNumberReader reader2 = new LineNumberReader(fileReader2);
		int number2 = 8 ; //璁剧疆鎸囧畾琛屾暟锛堥噸閲忥級
		String txt2= "" ;     //鐢ㄦ潵瀛樺偍寰楀埌鐨勪笉鍚岀殑閲嶉噺
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

		//鍒╃敤鍔ㄦ�佽鍒掔畻娉曡В鍐�0-1鑳屽寘闂
		int value[]= {408,921,1329,11,998,1009,104,839,943,299,374,673,703,954,1657,425,950,1375,430,541,971,332,483,815,654,706,1360,956,992,1948};
		int weight []= {508,1021,1321,111,1098,1196,204,939,1107,399,474,719,803,1054,1781,525,1050,1362,530,641,903,432,583,894,754,806,1241,1056,1092,1545};
		int w = 10149;//鑳屽寘瀹归噺
		int n = weight.length;//琛ㄧず鐗╁搧鐨勪釜鏁�
		int mvaluel[][] = new int[n + 1][w + 1];//鏈�澶т环鍊�
		int wup[][] = new int[n + 1][w + 1];//鏀惧叆鑳屽寘鐨勭墿鍝�
		int c=0;//璁板綍鑳屽寘閲岀殑鐗╁搧
		//鍒濆鍖�
		for (int i = 0; i < w + 1; i++) {
			mvaluel[0][i] = 0;
		}
		for (int i = 0; i < n + 1; i++) {
			mvaluel[i][0] = 0;
		}

		//鍔ㄦ�佽鍒�

		//排序的算法可以采用快速排序和冒泡排序
		for (int i=1; i <mvaluel.length;i++) {
			for (int j=1; j < mvaluel[i].length; j++) {
				//濡傛灉鐗╁搧鐨勯噸閲忓皬浜庡綋鍓嶈儗鍖呯殑瀹归噺
				if (weight[i - 1] > j) {
					mvaluel[i][j] = mvaluel[i - 1][j];
				} else {//濡傛灉鐗╁搧鐨勯噸閲忓ぇ浜庡綋鍓嶈儗鍖呯殑瀹归噺
					//濡傛灉涓婁竴娆℃渶澶т环鍊�<褰撳墠鐗╁搧鐨勪环鍊�+涓婁竴娆￠噸閲�-褰撳墠鐗╁搧閲嶉噺鐨勪环鍊兼�诲拰銆�
					if (mvaluel[i - 1][j] < value[i - 1] + mvaluel[i - 1][j - weight[i - 1]]) {
						mvaluel[i][j] = value[i - 1] + mvaluel[i - 1][j - weight[i - 1]];
						wup[i][j] = 1;//灏嗙墿鍝佹斁鍏ヨ儗鍖�
					} else {
						mvaluel[i][j] = mvaluel[i - 1][j];
					}
				}
			}
		}
		//杩囩▼
		for (int arr[] : mvaluel) {
			System.out.println(Arrays.toString(arr));
		}
		//姹傚嚭鏈�浼樿В
		int a = wup.length - 1;
		int b = wup[0].length - 1;
		for(c=0;c<3;c--) {//鍙湪鑳屽寘涓斁鍏ヤ笁涓墿鍝�
			while (a > 0 && b > 0) {
				if (wup[a][b] == 1) {
					System.out.println("灏嗙" + a + "涓晢鍝佹斁鍏ヤ簡鑳屽寘");
					 b=b- weight[a - 1];
				}
				a--;
			}
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println( "鎬诲叡鑺辫垂锛�" + (timeEnd - timeStart)/1000+ "s" );
	}
}
