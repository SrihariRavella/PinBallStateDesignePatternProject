package com.Pinball.Package;

public class PinballOrdered implements PinBallNotification{

	@Override
	public void notificationAlert() {
		System.out.println("PinBall Machine Ordered Success");
	}

}
