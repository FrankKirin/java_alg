package greedy_algorithm.single_source_shortest_path;

public class SingleSoutceShortestPath {
	public static final Double NaN = Double.NaN;
	public double getMinValue(double[] distance) {
		double value = distance[0];

		for(int i=1; i<distance.length; i++) {
			if(distance[i] < value) {
				value = distance[i];
			}
		}

		return value;
	}

	public static void main(String[] args) {
		double[][] e = {
				{0, 1, 12, NaN, NaN, NaN},
				{NaN, 0, 9, 3, NaN, NaN},
				{NaN, NaN, 0, NaN, 5, NaN},
				{NaN, NaN, 4, 0, 13, 15},
				{NaN, NaN, NaN, NaN, 0, 4},
				{NaN, NaN, NaN, NaN, NaN, 0},
		};

		double[] distance = {0, 1, 12, NaN, NaN, NaN};



	}
}
