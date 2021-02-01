package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import aggregation.Ball;
import aggregation.Basket;

class testbasket {

	@Test
	void testAddBal() {
		//fail("Not yet implemented");
		Basket b1=new Basket(2);
		b1.addBal("Red", 2);
		b1.addBal("Blue", 3);
		ArrayList<Ball> balls = b1.getListofBalls();
		assertEquals(2,balls.size());
		assertEquals("Red",balls.get(0).getColor());
		assertEquals(2,balls.get(0).getSize());
	}

}
