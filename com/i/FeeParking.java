package com.i;

public class FeeParking implements ParkingLot{
 
	public void parkCar();{
}
	public void unparkCar() {
		
	}
	public void getCapacity() {
		
	}
	public double calculateFee(Car car) {
		return 0;
	}
	public void doPayment(Car car) throws Exception {
		throw new Exception("Parking lot is free");
	}
}
