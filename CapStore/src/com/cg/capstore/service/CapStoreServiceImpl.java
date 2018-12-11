package com.cg.capstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dao.ICapstoreDAO;


@Service("capservice")
@Transactional
public class CapStoreServiceImpl implements ICapstoreService
{
	@Autowired
	ICapstoreDAO capdao;
	
	@Override
	public int quantity(String prodName) {
		// TODO Auto-generated method stub
		System.out.println("in service");
		return capdao.quantity(prodName);
	}

	@Override
	public double revenue(int soldqty,String prodName) {
		// TODO Auto-generated method stub
		return capdao.revenue(soldqty,prodName);
	}

}
