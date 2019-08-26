package tw;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import tw.Game;

class GameTest {
	@Test

	void should_return_1A0B_input_1567() {

		//given

		String input = "1 5 6 7";

		//when

		String result = null;

		try {

			result = Game.playGame(input);

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		//then

		assertEquals("1A0B", result);

	}

	

	@Test

	void should_return_0A2B_input_2478() {

		//given

		String input = "2 4 7 8";

		//when

		String result = null;

		try {

			result = Game.playGame(input);

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		//then

		assertEquals("0A2B", result);

	}

	

	@Test

	void should_return_1A2B_input_0324() {

		//given

		String input = "0 3 2 4";

		//when

		String result = null;

		try {

			result = Game.playGame(input);

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		//then

		assertEquals("1A2B", result);

	}

	

	@Test

	void should_return_0A4B_input_4321() {

		//given

		String input = "4 3 2 1";

		//when

		String result = null;

		try {

			result = Game.playGame(input);

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		//then
		assertEquals("0A4B", result);
	}

	@Test
	void should_return_4A0B_input_1234() {
		//given
		String input = "1 2 3 4";
		//when
		String result = null;
		try {
			result = Game.playGame(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//then
		assertEquals("4A0B", result);
	}

	@Test
	void should_return_error_input_1123() {
		//given
		String input = "1 1 2 3";
		//when
		String result = null;
		try {
			result = Game.playGame(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//then
		assertEquals("error", result);
	}

	@Test
	void should_return_error_input_12() {
		//given
		String input = "1 2";
		//when
		String result = null;
		try {
			result = Game.playGame(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//then
		assertEquals("error", result);
	}
}