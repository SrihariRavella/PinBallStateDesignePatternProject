package com.Pinball.Package;

public class PinballStateDecider {

	private PinBallNotification currentState;
	
	public PinballStateDecider() {
		currentState = new PinballOrdered();
	}
	
	public void changeState(PinBallNotification state) {
		currentState = state;
	}
	
	public void alert() {
		currentState.notificationAlert();
	}
}
