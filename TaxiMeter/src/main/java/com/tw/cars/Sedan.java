package com.tw.cars;

public class Sedan extends CarMeter {

	public Sedan(int basecharge, int distance) {
		super(basecharge, distance);
	}

	@Override
	public int calTarrif() {
		if(distance>3 && distance<=18)
			return basecharge+(distance-5)*12;
		else if(distance>18 && distance<100)//20
		{
			if(distance-5<=15)
				return (distance-5)*12+basecharge;
			else
				return basecharge+(15*10)+(distance-18)*10;//50+
		
		}
		else
			return 10*distance;
	}


}
