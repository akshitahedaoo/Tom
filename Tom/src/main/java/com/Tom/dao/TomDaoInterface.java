package com.Tom.dao;

import java.util.List;

import com.Tom.entity.TomUser;
import com.Tom.utility.TomException;

public interface TomDaoInterface {
	String adminpath="c:/";
	int insertInListDao(TomUser tu) throws TomException;

	void deleteInListDao(TomUser tu);

	void searchInListDao(TomUser tu);
	public List<TomUser> viewall() throws TomException;



}
