package com.revature.repositories;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Employee;
import com.revature.services.ConnectionUtility;

public class EmployeePostgres implements EmployeeDao{
	
		@Override
		public List<Employee> getAll() {
			String sql = "select * from employees;";
			List<Employee> employees = new ArrayList<>();

			try (Connection con = ConnectionUtility.getConnectionFromEnv()) {
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sql);

				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String username = rs.getString("username");
					String password = rs.getString("password");
					int man_id = rs.getInt("man_e_id");
//					Boolean isManager = rs.getBoolean("isman");
				
				
					Employee newEmp = new Employee(id, name, username, password);
					employees.add(newEmp);
				}
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
			return employees;
		}

		@Override
		public Employee add(Employee t) {
			String basicemployee = "Basic employee";
	                        t.setRole(basicemployee);
			String sql = "insert into employees (e_name, e_username, e_password, e_role, man_e_id) "
					+ "values (?, ?, ?, ?, ?) returning e_id;";

			try (Connection con = ConnectionUtility.getConnectionFromEnv()) {
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, t.getName());
				ps.setString(2, t.getUsername());
				ps.setString(3, t.getPassword());
				ps.setString(4, t.getRole());
				ps.setInt(5, 1);

				ResultSet rs = ps.executeQuery();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				
		}
			return t;
		}


		@Override
		public Employee getByID(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean update(Employee t) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Employee remove(Employee t) {
			// TODO Auto-generated method stub
			return null;
		}

}
