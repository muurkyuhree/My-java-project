package com.murk.doa;

import java.sql.*;
import java.util.*;
//import java.util.logging.*;

import com.murk.db.DBUtils;
import com.murk.model.News;

public class DataAccess {
	
	public void addNew(News n){
		
			try {
				PreparedStatement ps = DBUtils.getPreparedStatement("insert into public.News values(?,?,?,?,?,?)");
				ps.setString(1, n.getTitle());
				ps.setString(2, n.getDate());
				ps.setString(3, n.getDescription());
				ps.setString(4, n.getDetail());
				ps.setString(5, n.getCategory());
				ps.setString(6, n.getImage());
				ps.executeUpdate();
			}catch (ClassNotFoundException | SQLException sqe) {
				// TODO Auto-generated catch block
//				Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, sqe);
				sqe.printStackTrace();
			}

	}
	public static List<News> getAll(){
		List<News> ls = new LinkedList<>();
		
		try {
			ResultSet rs = DBUtils.getPreparedStatement("select * from News").executeQuery();
			while(rs.next()){
				News n = new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				ls.add(n);
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
	}
		
	


}
