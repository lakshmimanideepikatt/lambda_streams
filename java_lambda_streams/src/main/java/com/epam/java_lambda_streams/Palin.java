package com.epam.java_lambda_streams;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface Palin {
	void PalindromeList(List<String> list,Predicate<String> predicate);

}