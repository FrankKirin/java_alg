package greedy_algorithm.single_source_shortest_path;

import java.util.HashSet;
import java.util.Set;

public class SingleSoutceShortestPath {
	public static final Double NaN = Double.NaN;
	
	public int getMinValueLargeThanZero(double[] distance) {
		int value = Integer.MAX_VALUE;

		for(int i=0; i<distance.length; i++) {
			if(distance[i] < value && distance[i]>0) {
				value = i;
			}
		}

		return value;
	}

	public Set<Integer> getUnicomDistanceIndex(double[] distance) {
		Set<Integer> unicomDistance = new HashSet<Integer>();

		for (int i=0; i<distance.length; i++) {
			if(distance[i]>0) {
				unicomDistance.add(i);
			}
		}
		
		return unicomDistance;
	}

	public void updateDistance(double[] distance, Set<Integer> unicomDistanceIndex, int current_index, int shortest_path_index, double[][] distanceMap) {
		for (int idx: unicomDistanceIndex) {
			System.out.println(idx);
//			if (distanceMap[current_index][idx] == NaN) {
//				distance[idx] = distanceMap[current_index][idx];
//			}
//			else {
//				distance[idx] = Math.min(distanceMap[shortest_path_index][idx]+distanceMap[current_index][shortest_path_index], distanceMap[current_index][idx]);
//			}
		}
		System.out.print("###");
		
	}



	public static void main(String[] args) {
		SingleSoutceShortestPath shortestPath = new SingleSoutceShortestPath();

		double[][] distanceMap = {
				{0, 1, 12, NaN, NaN, NaN},
				{NaN, 0, 9, 3, NaN, NaN},
				{NaN, NaN, 0, NaN, 5, NaN},
				{NaN, NaN, 4, 0, 13, 15},
				{NaN, NaN, NaN, NaN, 0, 4},
				{NaN, NaN, NaN, NaN, NaN, 0},
		};

		double[] distance = distanceMap[0];

		for (int i=0; i<distanceMap[0].length; i++) {
//			double[] distance = distanceMap[i];
			int shortest_path_index = shortestPath.getMinValueLargeThanZero(distance);

			Set<Integer> unicomDistanceSet = shortestPath.getUnicomDistanceIndex(distanceMap[shortest_path_index]);

			shortestPath.updateDistance(distance, unicomDistanceSet, i, shortest_path_index, distanceMap);

		}

		for (int i=0; i<distance.length; i++) {
			System.out.println(distance[i]);
		}

	}
}
