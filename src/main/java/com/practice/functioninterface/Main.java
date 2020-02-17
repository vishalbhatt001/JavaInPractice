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
		List<Brand> brandList = new ArrayList<>(Arrays.asList(new Brand(modelList), null, new Brand(modelList2)));
		List<ItemType> itemtypes = new ArrayList<>(Arrays.asList(new ItemType(brandList), null));
		
		//itemtypes.forEach(e -> System.out.print(e.getBrands().get(0).getModels().get(0).getModel()));
		
		Optional<List<ItemType>> optionalsItems = Optional.ofNullable(itemtypes);
		optionalsItems.get().stream().flatMap(e -> Optional.ofNullable(e.getBrands().stream()).get()).flatMap(e -> Optional.ofNullable(e.getModels().stream()).get()).forEach(e -> System.out.print(Optional.ofNullable(e.getModel()).get()));
	}

}
