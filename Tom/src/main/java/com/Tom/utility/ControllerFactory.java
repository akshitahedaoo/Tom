package com.Tom.utility;

import com.Tom.business.TomBusiness;
import com.Tom.business.TomBusinessInterface;
import com.Tom.dao.TomDao;
import com.Tom.dao.TomDaoInterface;

public class ControllerFactory {
public ControllerFactory() {
		
	}

	public static TomBusinessInterface createObject(String nn) {
		// TODO Auto-generated method stub
		TomBusinessInterface di=null;
		if(nn.equals("adminservice")) {
			di=new TomBusiness();
		}
		return di;
	}
	
}
