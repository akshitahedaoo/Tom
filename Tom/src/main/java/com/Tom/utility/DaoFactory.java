package com.Tom.utility;

import com.Tom.dao.TomDao;
import com.Tom.dao.TomDaoInterface;

public class DaoFactory {
	public DaoFactory() {
		
	}

	public static TomDaoInterface createObject(String nn) {
		// TODO Auto-generated method stub
		TomDaoInterface di=null;
		if(nn.equals("admin")) {
			di=new TomDao();
		}
		return di;
	}

}
