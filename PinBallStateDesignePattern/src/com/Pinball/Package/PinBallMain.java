package com.Pinball.Package;

public class PinBallMain {

	public static void main(String[] args) {
		
		//		Existing state is Ordered
		PinballStateDecider object = new PinballStateDecider();
		object.alert();
		
		object.changeState(new PinBallShipped());  
		object.alert();
		
		object.changeState(new OutForDelievary());
		object.alert();
		
		object.changeState(new PinBallDelivered());
		object.alert();
		
		
	}
}
