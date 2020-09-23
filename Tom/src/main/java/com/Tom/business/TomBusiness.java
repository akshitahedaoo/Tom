package com.Tom.business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.Tom.dao.TomDaoInterface;
import com.Tom.entity.TomAddress;
import com.Tom.entity.TomUser;

import com.Tom.utility.DaoFactory;
import com.Tom.utility.TomException;


	

public class TomBusiness implements TomBusinessInterface{
	
	private TomDaoInterface ti;
	public TomBusiness() {
		ti=DaoFactory.createObject("admin");
	}


//	TomUser tu=new TomUser();
		public void insertinList() throws TomException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("enter ur name");
		String 	name = br.readLine();
		System.out.println("enter ur email");
	
		String email = br.readLine();
	
		System.out.println("enter ur pswd");
		String	password = br.readLine();
		System.out.println("enter ur street");
		String street = br.readLine();
		System.out.println("enter ur state");
		String state = br.readLine();
		System.out.println("enter ur country");
		String country = br.readLine();
		TomAddress ta=new TomAddress();
		
	
		 TomUser u=new TomUser();
		
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setAddress(address);
		int i=ti.insertInListDao(u);
		}catch(IOException t1) {
			throw new TomException("");
		}
		
	}
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void deleteinList() throws TomException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("enter the name u want to delete");
//		String name=br.readLine();
//		u.setName(name);
//		ti.deleteInListDao(u);
		
	}
	public void searchinList()throws TomException {
//		ti.searchInListDao(u);
		
	}
	public void viewall()throws TomException {
		// TODO Auto-generated method stub
		try {
		List<TomUser> ll=ti.viewall();
		
		for(TomUser oo:ll) {
			System.out.println(oo.getName());
		}
		}
		catch(TomException  t) {
			throw t;
		}
		
	}
		
		
	

}
