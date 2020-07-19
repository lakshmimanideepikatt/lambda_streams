package com.epam.java_lambda_streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App implements Palin
{
	public void PalindromeList(List<String> list,Predicate<String> predicate) {
		for(String s:list) {
			if(predicate.test(s)) {
				System.out.print(s+" ");
			}
		}
		System.out.println();
	}
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean flag = true;
    	Average avgobj = new Average();
    	App app = new App();
    	StringFilter sfobj = new StringFilter();
    	while(flag) {
    		System.out.println("Press 1: Average of n numbers");
    		System.out.println("Press 2: To check which strings starts with 'a' and length 3");
    		System.out.println("Press 3: To check which strings are palindrome");
    		int option = Integer.parseInt(br.readLine());
    		if(option == 1) {
    			System.out.println("Enter n numbers seperated by space: ");
    			String[] average_input = br.readLine().split(" ");
    			List<Integer> avg_input_list = new ArrayList<>();
    			for(String s:average_input)
    				avg_input_list.add(Integer.parseInt(s));
    			System.out.println(avgobj.findAverage(avg_input_list));
    		}else if(option == 2) {
    			System.out.println("Enter the strings seperated by space: ");
    			String[] filter_input = br.readLine().split(" ");
    			List<String> filtered_list = sfobj.filterStrings(Arrays.asList(filter_input));
    			for(String s:filtered_list)
    				System.out.print(s+" ");
    			System.out.println();
    		}else if(option == 3){
    			System.out.println("Enter the strings separated by space: ");
    			String[] palindrome_input = br.readLine().split(" ");
    			app.PalindromeList(Arrays.asList(palindrome_input), (s)->s.equals(new StringBuilder(s).reverse().toString()));
    		}else {
    			flag = false;
    			return;
    		}
    	}
    }
}