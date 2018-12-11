package com.cg.capstore.dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.capstore.dto.Product;



@Repository("capdao")
public class CapStoreDaoImpl implements ICapstoreDAO{

	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public int quantity(String prodName) {
		System.out.println("in dao");
		Query query1=entitymanager.createQuery("FROM Product WHERE prodId=:productname");
		query1.setParameter("productname", prodName);
	
			Product product=(Product) query1.getSingleResult();
			
			System.out.println(product);
			int supplied =product.getQtySupplied();
			int available =product.getQtyAvailable();
			System.out.println(supplied+","+ available);
			int sold = supplied - available;
		
		return sold;
	
}	

	@Override
	public double revenue(int soldqty,String prodName) {
		Query query2=entitymanager.createQuery("select price FROM Product WHERE prodId=:prodName");
		query2.setParameter("prodName", prodName);
		
			double product2=(double) query2.getSingleResult();
			System.out.println(product2);
		    double  price2=(double) product2;
		    double revenue=soldqty*price2;
		return revenue;
		
	   
	    
	}

}
