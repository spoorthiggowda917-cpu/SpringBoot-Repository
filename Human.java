package com.tnsif.autowiring;

public class Human {
	Heart heart;
//if having many classes then use autowired annotation
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

//	public Human(Heart heart) {
//		super();
//		this.heart = heart;
//	}
	public void startPumping() {
		heart.pump();
	}

}
