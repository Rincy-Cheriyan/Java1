package com.tw.cars;

public class Mini extends CarMeter {

	
	
	public Mini(int basecharge, int distance) {
		super(basecharge, distance);
	}

	@Override
	public int calTarrif() {
		if(distance>3 && distance<=18)
			return basecharge+(distance-3)*10;
		else if(distance>18 && distance<75)//20
		{
			if(distance-3<15)
				return (distance-3)*8+basecharge;
			else
				return basecharge+(15*10)+(distance-18)*8;//50+
		
		}
		else
			return 8*distance;
	}

}
