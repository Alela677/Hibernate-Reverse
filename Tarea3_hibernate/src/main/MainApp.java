package main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import models.HibernateUtil;
import models.Products;

public class MainApp {

	public static void main(String[] args) {

		Session sesion = HibernateUtil.getSession();

		sesion.getTransaction().begin();

		Query<Products> query = sesion.createQuery("FROM Products");
		List<Products> products = query.list();

		for (Products productos : products) {
			System.out.println(productos);
		}

		sesion.getTransaction().commit();
		sesion.close();
	}
}
