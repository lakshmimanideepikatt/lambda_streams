package com.epam.java_lambda_streams;

import java.util.*;
import java.util.stream.Collectors;

public class StringFilter {
	public List<String> filterStrings(List<String> list){
		return list.stream().filter(string ->string.charAt(0)=='a' && string.length()==3).collect(Collectors.toList());
	}
}
