package com.cg.oct12.batch3.Day6.Enum;

public class App {
public static void main(String[] args) {
	AppUser appuser=new AppUser();
	appuser.userName="Urvesh";
	
	appuser.role=Role.ADMIN;
	System.out.println(appuser.userName);
	System.out.println(appuser.role);
}
}
