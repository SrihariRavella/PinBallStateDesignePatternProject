package com.Pinball.Package;

public class PinBallDelivered implements PinBallNotification{

	@Override
	public void notificationAlert() {
		System.out.println("Delievered Success");
	}

}
