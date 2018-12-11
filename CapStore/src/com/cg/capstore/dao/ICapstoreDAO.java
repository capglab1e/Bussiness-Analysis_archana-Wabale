package com.cg.capstore.dao;

import com.cg.capstore.dto.Product;

public interface ICapstoreDAO {

	public int quantity(String prodName);
	public double revenue(int soldqty,String prodName);
}
