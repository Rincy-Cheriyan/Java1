package com.tw.test;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.tw.cars.CarMeter;
import com.tw.cars.Mini;
import com.tw.cars.SUV;
import com.tw.cars.Sedan;

import junit.framework.Assert;

public class TestCars {
	CarMeter car;
	
	
	
	@Test
	public void test1()
	{
		car=new SUV(100,10);
		Assert.assertEquals(175, car.calTarrif());
	}
	
	@Test
	public void test2()
	{
		car=new SUV(100,20);
		Assert.assertEquals(325, car.calTarrif());
	}
	
	@Test
	public void test3()
	{
		car=new SUV(100,120);
		Assert.assertEquals(1560, car.calTarrif());
	}

}
