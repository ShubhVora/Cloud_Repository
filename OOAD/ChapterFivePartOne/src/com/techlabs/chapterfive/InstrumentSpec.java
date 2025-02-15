package com.techlabs.chapterfive;

public abstract class InstrumentSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood, topWood;
	

	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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

	public boolean matches(InstrumentSpec otherSpec) {
		if (this.builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
			return false;

		if (type != otherSpec.type)
			return false;

		if (backWood != otherSpec.backWood)
			return false;

		if (topWood != otherSpec.topWood)
			return false;

		return true;
	}

	

}
