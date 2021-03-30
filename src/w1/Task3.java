package w1;

import java.io.IOException;
//任务3：能够对一组D{0-1}KP数据按项集第三项的价值:重量比进行非递增排序；
public class Task3 {
	public static void main(String[] args) throws IOException {
		double value[]= {408,921,1329,11,998,1009,104,839,943,299,374,673,703,954,1657,425,950,1375,430,541,971,332,483,815,654,706,1360,956,992,1948};
		double weight []= {508,1021,1321,111,1098,1196,204,939,1107,399,474,719,803,1054,1781,525,1050,1362,530,641,903,432,583,894,754,806,1241,1056,1092,1545};
		quicksort(value,weight);
	}
	public static void quicksort(double[] value, double[] weight){
		double[] rate = new double[value.length];
		for(int i=0;i<value.length;i++){ 
			double jiazhi = value[i]/weight[i];
			rate[i] = jiazhi;
		}
		//
		quick(rate, value, weight, 0, rate.length-1); //快速排序
		for(int i=0;i<rate.length;i++) {
			System.out.println(rate[i]);
		}
	}
	private static void quick(double[] rate, double[] value, double[] weight, int beg, int end){
		if(beg<end){
			int pivot = partition(rate, value, weight, beg, end);
			quick(rate, value, weight, beg, pivot-1);//快速排序算法
			quick(rate, value, weight, pivot+1, end);
		}
	}
	private static int partition(double[] rate, double[] value, double[] weight, int beg, int end){
		int pivot = end;
		int index = beg;
		for(int i=beg;i<=end;i++){
			if(rate[i]<rate[pivot]){
				double temp = rate[i];
				rate[i] = rate[index];
				rate[index] = temp;
				temp = value[i];
				value[i] = value[index];
				value[index] = temp;
				temp = weight[i];
				weight[i] = weight[index];
				weight[index] = temp;
				index ++;
			}
		}
		double temp = rate[index];
		rate[index] = rate[pivot];
		rate[pivot] = temp;
		temp = value[index];
		value[index] = value[pivot];
		value[pivot] = temp;
		temp = weight[index];
		weight[index] = weight[pivot];
		weight[pivot] = temp;
		return index;
	}
}
