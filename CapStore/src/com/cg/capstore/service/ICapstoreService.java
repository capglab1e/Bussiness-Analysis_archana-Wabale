package com.cg.capstore.service;

import com.cg.capstore.dto.Product;

public interface ICapstoreService {

	public int quantity(String product);
	public double revenue(int revenue,String prodName);
	
}
