package com.javaeasy.com.git_demo;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
        public void printData(){
		System.out.println("method addedd toprint the data");
	}
        
        public void printDataName(){
    		System.out.println("method addedd toprint the data a new method added added loggers");
    	}
	public void addData(String data) {
		System.out.println("git demo project");
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("inside if");
		} else {
			System.out.println("inside else");
		}
	}
}
