package com.practice.functioninterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Model> modelList = new ArrayList<>(Arrays.asList(new Model("Nokia101"), null, new Model("Nokia102"), null, new Model("Nokia103")) );
		List<Model> modelList2 = new ArrayList<>(Arrays.asList(new Model("Nokia201"), null, new Model("Nokia202"), null, new Model("Nokia203")) );
		Optional<List<Model>> op1 = Optional.ofNullable(modelList);
		Optional<List<Model>> op2 = Optional.ofNullable(modelList2);
		List<Brand> brandList = new ArrayList<>(Arrays.asList(new Brand(op1.orElse(op1.get())), null, new Brand(op2.orElse(op2.get()))));
		Optional<List<Brand>> op3 = Optional.ofNullable(brandList);
		List<ItemType> itemtypes = new ArrayList<>(Arrays.asList(new ItemType(op3.orElse(op3.get())), null));
		
		//itemtypes.forEach(e -> System.out.print(e.getBrands().get(0).getModels().get(0).getModel()));
		
		Optional<List<ItemType>> optionalsItems = Optional.ofNullable(itemtypes);
		optionalsItems.orElse(optionalsItems.get()).stream().flatMap(e -> e.getBrands().stream()).forEach(e -> System.out.print(e));
		
		//optionalsItems.orElse(optionalsItems.get()).stream().flatMap(e -> e.getBrands().stream()).flatMap(e -> e.getModels().stream()).forEach(e -> System.out.print(e.getModel()));
	}

}
