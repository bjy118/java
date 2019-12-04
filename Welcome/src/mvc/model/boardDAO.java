package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mvc.database.DBConnection;

public class boardDAO {
	
	private static boardDAO instance;
	
	private boardDAO() {
	}
	
	public static boardDAO getInstance() {
		if (instance == null)
			instance = new boardDAO();
		return instance;
	}
	public int getListCount() {
		
	}

}
