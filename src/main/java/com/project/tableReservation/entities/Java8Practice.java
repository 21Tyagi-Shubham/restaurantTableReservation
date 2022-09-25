//package com.project.tableReservation.entities;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Java8Practice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		List<Integer> numbers=new ArrayList<>();
//		
//		List<String> courses=new ArrayList<>();
//		List<Integer> evenNumbers=new ArrayList<>();
//		
//		List<String> courseLength=new ArrayList<>();
//		
//		numbers.add(1);
//		numbers.add(10);
//		numbers.add(11);
//		numbers.add(13);
//		numbers.add(11);
//		numbers.add(12);
//		numbers.add(15);
//		
//		//numbers.stream().distinct().forEach(System.out::println);
//		//numbers.stream().distinct().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
//		//numbers.stream().filter(n->n%2==0).map(n->n*n*n).forEach(System.out::println);
//		//int result=numbers.stream().reduce(0,(a,b)->a+b);
//		//System.out.println(result);
//		
//		//int result=numbers.stream().map(n->n*n*n).reduce(0, (a,b)->a+b);
//		//System.out.println(result);
//		
//		//int result=numbers.stream().filter(n->n%2==0).reduce(0, (a,b)->a+b);
//		//System.out.println(result);
//		
//		//evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
//		//System.out.println(evenNumbers);
//		
//		courses.add("Spring");
//		courses.add("Springboot");
//		courses.add("API");
//		courses.add("MicroServices");
//		courses.add("AWS");
//		courses.add("Mocker");
//		courses.add("Docker");
//
//		//courses.stream().filter(n->n.length()>4).forEach(System.out::println);
//		//courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
//		//courses.stream().map(course->course+ " "+course.length()).forEach(System.out::println);
//		
//		//courses.stream().sorted(Comparator.comparing(course->course.length())).forEach(System.out::println);
//	     courseLength=courses.stream().map(course->course + " " +course.length()).collect(Collectors.toList());
//	     System.out.println(courseLength);
//	     
//	
//	}
//
//}
