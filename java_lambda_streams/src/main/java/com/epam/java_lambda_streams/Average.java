package com.epam.java_lambda_streams;

import java.util.List;

public class Average {
	public double findAverage(List<Integer> list) {
		return list.stream().mapToInt((val)->val.intValue()).average().getAsDouble();
	}
}