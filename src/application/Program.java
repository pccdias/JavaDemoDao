package application;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import db.DB;
import db.DbException;
import model.entities.Department;
import model.entities.Seller;


public class Program {

	public static void main(String[] args) {

		Department dep = new Department(1, "Books");
		System.out.println(dep.toString());
		
		Seller seller = new Seller(1, "José", "jose@gmail.com", new Date(), 2300.00, dep);
		System.out.println(seller.toString());
	}

}
