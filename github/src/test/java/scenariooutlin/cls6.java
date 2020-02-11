package scenariooutlin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class cls6 {
	@Given("I am a {word} tester")
	public void I_am_a_good_tester(String symbol) {
		System.out.println("I am a "+symbol+ "tester");
	}
	@And("I go to work")
	public void I_go_to_work() {
		System.out.println("I go to work");
	}
	

}
