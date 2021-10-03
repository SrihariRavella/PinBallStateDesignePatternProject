package com.Pinball.Package;

public class PinBallShipped implements PinBallNotification{

	@Override
	public void notificationAlert() {
		System.out.println("Shipping In Progress");
	}

}
