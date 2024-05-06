package com.library.dao;

import java.sql.SQLException;

public interface BookNameDAO 
{
	void read()throws ClassNotFoundException,SQLException;
	void insert()throws ClassNotFoundException,SQLException;
	void login()throws ClassNotFoundException,SQLException;
	void register()throws ClassNotFoundException,SQLException;
	void update()throws ClassNotFoundException,SQLException;
    void delete()throws ClassNotFoundException,SQLException;
    
}
