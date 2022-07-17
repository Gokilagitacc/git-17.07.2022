package org.phone;

public class Phone {
	
	private void phoneInfo(String name, int version, String Ram) {
	System.out.println("Model Name: "+name+"\n"+"Version: "+version+"\n"+"RAM: "+Ram+"\n");
	}
   
	private void phoneInfo(String Ram, String name, int version) {
		System.out.println("Ram: "+Ram+"\n"+"Model Name: "+name+"\n"+"Version: "+version);
		
	}
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo("Oppo",11,"64GB");
		ph.phoneInfo("86GB","Samsung j3",8);
		
	}
}
