package com.tw.cars;

public class SUV extends CarMeter {
	public SUV(int basecharge, int distance) {
		super(basecharge, distance);
	}

	@Override
	public int calTarrif() {
		if(distance>3 && distance<=18)
			return basecharge+(distance-5)*15;
		else if(distance>18 && distance<100)//20
		{
			if(distance-5<=15)
				return (distance-5)*15+basecharge;
			else
				return basecharge+(15*15)+(distance-20)*12;//50+
		
		}
		else
			return 13*distance;
	}

}
