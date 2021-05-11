package nextdateTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import nextdate.NextDate;

public class NextDateTest {
	NextDate date;
	
	
		
		
	
	
	
    @Test
    @DisplayName("--Testing run method--")
	public void runNextDateTest() {
    	date = new NextDate(0,5,1991);
	    assertEquals("invalid Input Date",date.run(0,6,1991));
	}
    @Test
    @DisplayName("--Testing use case number 2  --")
	public void runOnUseCaseTwo() {
    	date = new NextDate(5,31,2021);
	    assertEquals("6/1/2021",date.run(5,31,2021));
	}
    @Test
    @DisplayName("--Testing use case number 3  --")
	public void runOnUseCaseThree() {
    	date = new NextDate(5,30,2021);
	    assertEquals("5/31/2021",date.run(5,30,2021));
	}
    @Test
    @DisplayName("--Testing use case number 4  --")
	public void runOnUseCaseFour() {
    	date = new NextDate(4,29,2021);
	    assertEquals("4/30/2021",date.run(4,29,2021));
	}
    @Test
    @DisplayName("--Testing use case number 5  --")
	public void runOnUseCaseFive() {
    	date = new NextDate(4,30,2021);
	    assertEquals("5/1/2021",date.run(4,30,2021));
	}
    @Test
    @DisplayName("--Testing use case number 6--")
	public void runOnUseCaseSix() {
    	date = new NextDate(4,31,2021);
	    assertEquals("Invalid Input Date",date.run(4,31,2021));
	}
    @Test
    @DisplayName("--Testing use case number 7--")
	public void runOnUseCaseSeven() {
    	date = new NextDate(12,28,2021);
	    assertEquals("12/29/2021",date.run(12,28,2021));
	}
    @Test
    @DisplayName("--Testing use case number 8--")
	public void runOnUseCaseEight() {
    	date = new NextDate(12,31,2021);
	    assertEquals("Invalid Next Year",date.run(12,31,2021));
	}
    @Test
    @DisplayName("--Testing use case number --")
	public void runOnUseCaseNinet() {
    	date = new NextDate(1,42,2021);
	    assertEquals("invalid Input Date",date.run(1,42,2021));
	}
    @Test
    @DisplayName("--Testing use case number 10 --")
	public void runOnUseCaseTen() {
    	date = new NextDate(2,27,2021);
	    assertEquals("2/28/2021",date.run(2,27,2021));
	}
    @Test
    @DisplayName("--Testing use case number 11 --")
	public void runOnUseCaseEleven() {
    	date = new NextDate(2,28,2020);
	    assertEquals("2/29/2020",date.run(2,28,2020));
	}
    @Test
    @DisplayName("--Testing use case number 12 --")
	public void runOnUseCaseTwelve() {
    	date = new NextDate(2,28,2021);
	    assertEquals("3/1/2021",date.run(2,28,2021));
	}
    @Test
    @DisplayName("--Testing use case number 13 --")
	public void runOnUseCaseThirteen() {
    	date = new NextDate(2,29,2020);
	    assertEquals("3/1/2020",date.run(2,29,2020));
	}
    @Test
    @DisplayName("--Testing use case number 14 --")
	public void runOnUseCaseFourteen() {
    	date = new NextDate(2,29,2021);
	    assertEquals("Invalid Input Date",date.run(2,29,2021));
	}
    @Test
    @DisplayName("--Testing use case number 15 --")
	public void runOnUseCaseFithteen() {
    	date = new NextDate(2,30,2021);
	    assertEquals("Invalid Input Date",date.run(2,30,2021));
	}
    
    
    
}
