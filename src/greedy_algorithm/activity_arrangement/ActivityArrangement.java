/*
 * 活动开始时间 activity_start=[]
 * 活动结束时间 activity_end=[]
 * 
 * */
package greedy_algorithm.activity_arrangement;

import java.util.Arrays;

public class ActivityArrangement {
	public int[] get_activity_time_span(int[] activity_start, int[] activity_end) {
		int[] time_span = new int[2];
		time_span[0] = Arrays.stream(activity_start).min().getAsInt();
		time_span[1] = Arrays.stream(activity_end).max().getAsInt();

		return time_span;
	}
	
	public static void main(String[] args) {
		int[] activity_start = {1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12};
		int[] activity_end = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		int[] choosed_activity = new int[activity_start.length];

		ActivityArrangement activity_arrange = new ActivityArrangement();

		int [] time_span = activity_arrange.get_activity_time_span(activity_start, activity_end);

		int activity_time_end = time_span[0];
		for(int activity_num=0; activity_num<activity_start.length; activity_num++) {
			if(activity_start[activity_num] > activity_time_end) {
				choosed_activity[activity_num] = 1;
				activity_time_end = activity_end[activity_num];
			}
		}

		for(int i=0; i<choosed_activity.length; i++) {
			System.out.println(choosed_activity[i]);
		}
	}
}
