import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

	public class DogTest {
		@Test
		public void testBark(){
			String actualString = Dog.isBark();
			String expectedString = "woof";
			assertEquals(expectedString, actualString);

		}



	}