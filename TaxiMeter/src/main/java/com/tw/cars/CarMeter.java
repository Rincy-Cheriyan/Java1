package com.tw.cars;

public abstract class CarMeter {
	
	protected int basecharge;
	protected int distance;
	
	public CarMeter(int basecharge, int distance) {
		super();
		this.basecharge = basecharge;
		this.distance = distance;
	}
	
	public abstract int calTarrif();
	
	

}
