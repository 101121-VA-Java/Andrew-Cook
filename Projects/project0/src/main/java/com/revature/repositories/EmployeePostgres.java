package com.revature.repositories;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Employee;
import com.revature.services.ConnectionUtility;

public class EmployeePostgres implements EmployeeDao{
	

		@Override
		public Employee[] getAllEmployees() {
			String sql = "select * from employees;";
			List<Employee> employees = new ArrayList<>();

			try (Connection con = ConnectionUtility.getConnectionFromFile()) {
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sql);

				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String username = rs.getString("username");
					String password = rs.getString("password");
					int man_id = rs.getInt("man_e_id");
					Boolean isManager = rs.getBoolean("isman");
				
				
					Employee newEmp = new Employee(id, name, username, password);
					employees.add(newEmp);
				}
			} catch (IOException | SQLException e1) {
			
				e1.printStackTrace();
			}
			return employees;
		}

		@Override
		public Employee add(Employee t) {
			// TODO Auto-generated method stub
			return null;
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

		@Override
		public List<Employee> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Employee getEmployeeById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int addEmployee(Employee e) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean editEmployee(Employee e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean deleteEmployee(int id) {
			// TODO Auto-generated method stub
			return false;
		}
}
