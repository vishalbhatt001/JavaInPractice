package com.practice.functioninterface;

import java.util.List;

public class ItemType {

	private List<Brand> brands;

	public ItemType(List<Brand> brands) {
		this.brands = brands;
	}

	public List<Brand> getBrands() {
		return brands;
	}

	@Override
	public String toString() {
		return "ItemType [brands=" + brands + "]";
	}

	
	
	
	
	
}
