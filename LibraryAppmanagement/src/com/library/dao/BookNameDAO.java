package com.library.dao;

import java.sql.SQLException;

public interface BookNameDAO {
	void read()throws ClassNotFoundException,SQLException;
	void insert()throws ClassNotFoundException,SQLException;

}
