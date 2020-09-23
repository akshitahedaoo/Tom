package com.Tom.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Tom.business.TomBusinessInterface;
import com.Tom.utility.ControllerFactory;


public class TomView {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TomBusinessInterface ei;
		 ei=ControllerFactory.createObject("adminservice");
		String cc="y";
		while(cc.equals("y")) {
		System.out.println("*********MAIN MENU*************");
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to delete profile");
		System.out.println("Press 3 to search profile");
		System.out.println("Press 4 to view profile");
		System.out.println("enter your choice");
		int i=Integer.parseInt(br.readLine());
		
		 
		
		switch(i) {
		case 1:ei.insertinList();
			break;
		case 2:ei.deleteinList();
			break;
		case 3:ei.searchinList();
			break;
		case 4:ei.viewall();
		break;
		
		default:System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		cc=br.readLine();
		}
		
	}

}
