public class PrintfExamples {

	public static void main(String[] args) {
	  int myInt = 1;
	  String myString = "Hello";
    float myFloat = 103.1234567f;
    double myDouble = 3.14159265358979311599796346854;
    
    //print "Number =" and then various formatted versions 
    // of myInt then take a new line using %n after each
    System.out.printf("Number = %d %n", myInt);
    System.out.printf("Number = %02d %n", myInt);
    System.out.printf("Number = %03d %n", myInt);
    System.out.printf("Number = %+03d %n", myInt);
    System.out.printf("%n");
    
      
    //print "Hello World" and add some extra spaces to the left
    // and take a new line using %n
    System.out.printf("%s World %n", myString);
    System.out.printf("%10s World %n", myString);
    System.out.printf("%n");

      
    //print two version of the myFloat number and take a
    //new line using %n
    System.out.printf("%10.4f and %.2f %n", myFloat, myFloat);
    System.out.printf("%n");

      
    //print MyDouble, myFloat and myInt in colunms  
    //and take a new line using %n  
    //the line of numbers are just printed t help you see 
    //the column spacing
    System.out.println("12345123451234512345123451234512345");
    System.out.printf("%10.2f%10.3f%10d %n", myDouble, myFloat,myInt);
    
	}
}