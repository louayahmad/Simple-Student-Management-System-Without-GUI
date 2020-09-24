public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int testScore1, testScore2, testScore3;
   private double finalAverage;
   
   public Student (String first, String last, Address home,
                   Address school, int testOne, int testTwo, int testThree)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      
      testScore1 = testOne;
      testScore2 = testTwo; 
      testScore3 = testThree;
      
   }
   
   public Student ()
   {
	      
	  testScore1 = 0;
	  testScore2 = 0; 
	  testScore3 = 0;
	      
   }
   
   public void setTestScore (int numOfTest, int score) 
   
   {
	   if(numOfTest==1) 
	   {
		   
		   testScore1 = score;
		   
	   }
	   
	   else if(numOfTest==2) 
	   {
		   
		   testScore2 = score;
		   
	   }
	   
	   else if(numOfTest==3) 
	   {
		   
	       testScore3 = score;
	       
	   }
	 
   }
  
   
   public int getTestScore (int numOfTest)
   
   {
	   if(numOfTest==1) 
	   {
		   
           return testScore1;
		   
	   }
	   
	   else if(numOfTest==2) 
	   {
		   
           return testScore2;
		   
	   }
	   
	   else if(numOfTest==3) 
	   {
		   
           return testScore3;
	       
	   }
	 
	   else 
	   {
		   
		   return 0;
		   
	   }
		   
   }
   
   public double calculateAverage () 
   
   {
	   finalAverage = (testScore1 + testScore2 + testScore3);
	   
	   return finalAverage/3;
	   
   }

   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress + "\n";

      result +="The score for test 1 is: "+ testScore1 + "\n";
      result +="The score for test 2 is: "+ testScore2 + "\n";
      result += "The score for test 3 is: "+ testScore3 + "\n"; 
       
      result += "The average of the test scores: "+ Math.round(finalAverage/3);

      return result;
   }
 
}
