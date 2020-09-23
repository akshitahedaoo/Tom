package com.Tom.dao;


import java.util.ArrayList;
import java.util.List;

import com.Tom.entity.TomUser;
import com.Tom.utility.TomException;


public class TomDao implements TomDaoInterface{
	private ArrayList<TomUser>ll=null;
	public TomDao() {
		ll=new ArrayList<TomUser>();
		System.out.println("adminpath");
	}
	

	public int insertInListDao(TomUser u) throws TomException {
		// TODO Auto-generated method stub
		int i=0;
		ll.add(u);
	
		
		if(ll.size()>0) {
			i=1;
		}
		
		return i;
		
	}

	public void deleteInListDao(TomUser u) {
		// TODO Auto-generated method stub
		ll.remove(0);
//		ll.remove(ll.indexOf(u));
		
	}

	public void searchInListDao(TomUser u) {
		// TODO Auto-generated method stub
		ll.contains(u);
	}
	
	public List<TomUser> viewall() throws TomException{
		
		if(ll.size()==0) {
			throw new TomException("");
		}
		return ll;
	}
	

}
