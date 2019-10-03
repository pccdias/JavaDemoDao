package application;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import db.DB;
import db.DbException;
import model.entities.Department;


public class Program {

	public static void main(String[] args) {

		Department dep = new Department(1, "Books");
		System.out.println(dep.toString());
	}

}
