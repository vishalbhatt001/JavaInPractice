package com.practice.functioninterface;

import java.util.List;

public class Brand {

	private List<Model> models;

	public Brand(List<Model> models) {
		this.models = models;
	}

	public List<Model> getModels() {
		return models;
	}

	@Override
	public String toString() {
		return "Brand [models=" + models + "]";
	}

	
	
	
	
}
