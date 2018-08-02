package com.techlabs.chapterone;

public class GuitarSpec {
	private String model;
	Builder builder;
	Type type;
	Wood backWood, topWood;
	private int numString;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numString = numString;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public int getNumString() {
		return this.numString;
	}

	public boolean matches(GuitarSpec otherSpec) {
		if (this.builder != otherSpec.getBuilder())
			return false;
		if ((model != null) && (!model.equals("")) && (!model.toLowerCase().equals(otherSpec.getModel().toLowerCase())))
			return false;

		if (type != otherSpec.getType())
			return false;

		if (backWood != otherSpec.getBackWood())
			return false;

		if (topWood != otherSpec.getTopWood())
			return false;

		if (numString != otherSpec.getNumString())
			return false;

		return true;
	}



}
