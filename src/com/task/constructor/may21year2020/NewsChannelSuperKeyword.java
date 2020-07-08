package com.task.constructor.may21year2020;

public class NewsChannelSuperKeyword extends Reporter {

	public NewsChannelSuperKeyword() {
		super();
		System.out.println("This is the Best News Channel Default Constructor");
	}
	public NewsChannelSuperKeyword(int a) {
		super("RAVISH KUMAR");
		System.out.println("The Best News Anchor Salary is :" +a);
	}
	public NewsChannelSuperKeyword(String s) {
		System.out.println("The Best News Anchor for NDTV is :" +s);
		
	}
	public NewsChannelSuperKeyword(String fname ,String lname,int Salary) {
		System.out.println("The First Name for the best news anhor for Zee News : "+fname);
		System.out.println("The Last Name for the best news anhor for Zee News : "+lname);
		System.out.println("The Salary for the best news Anchor for Zee News  : " +Salary);

		
		
	}
	

	public static void main(String[] args) {
		NewsChannelSuperKeyword nl=new NewsChannelSuperKeyword();

}
	}
