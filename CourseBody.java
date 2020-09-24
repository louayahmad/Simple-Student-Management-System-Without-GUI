public class CourseBody {

   public static void main(String[] args) {

       Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
       Address jHome = new Address("21 Jump Street", "Lynchburg", "VA", 24551);
       Student john = new Student("John", "Smith", jHome, school, 100, 74, 82);

       Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
       Student marsha = new Student("Marsha", "Jones", mHome, school, 90, 100, 75);

       Address hHome = new Address("76 E Emerson St.", "Short Hills", "NJ", 07013);
       Student marshal = new Student("Marshall", "Mathers", hHome, school, 84, 66, 77);
       
       Address lHome = new Address("20 Hepburn Rd", "Franklin Lakes", "NJ", 07012);
       Student louay = new Student("Louay", "Ahmad", lHome, school, 44, 100, 82);
       
       Course calculus = new Course("Calculus I");

       
       calculus.addStudent(john);
       john.calculateAverage();

       calculus.addStudent(marsha);
       marsha.calculateAverage();
       
       calculus.addStudent(marshal);
       marshal.calculateAverage();
       
       calculus.addStudent(louay);
       louay.calculateAverage();
       
       System.out.println("Students in class: ");
       calculus.roll();
       
       System.out.println();
       System.out.printf("Overall Course test average: "+ Math.round(calculus.calculateAverage()));
   }

}
