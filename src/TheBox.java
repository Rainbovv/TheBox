

	// classes / class relationships
	// static methods / properties
	import java.util.Scanner;

class TheBox {


	  public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);

	//# Variables

		  int value, width, height, lenght, volume;  


	/////////////// INPUT LAYER //////////////////////
		  System.out.println("Enter the VALUE of the BOX:");
		  value = in.nextInt();
	    
		  System.out.printf("%nThe BOX is OK or BROKEN?%nIf OK %6s enter %2s  1%nIf BROKEN %2s enter %2s  2%n","-","-","-","-");
		  Box.isTheBoxBroken();
		    
		  System.out.println("\nEnter the LENGHT of the BOX:");
		  lenght = in.nextInt();
		    
		  System.out.println("\nEnter the WIDTH of the BOX:");
		  width = in.nextInt()  ;
		    
		  System.out.println("\nEnter the HEIGHT of the BOX:");
		  height = in.nextInt();
	
		  volume = lenght * width * height;      

	/////////////// OUTPUT /////////////
		  divider();
		  Box.print(value);
		  Box.printIsTheBoxBig(value);
		  Box.printIsTheBoxOk();
		  Box.printBoxSize(lenght, width, height);
		  Box.printBoxVolume(volume);

	  }
	  
	  static void divider(){
		  System.out.println("\n#########################\n");
	  }
}
	///////////////////////
class BoxConfig{

	// #Properties of the class
	  static boolean broken;
	 
	/// Checking the status of the BOX.
	  static void isTheBoxBroken(){
		  Scanner in = new Scanner(System.in);
	      
		  switch(in.nextInt()){
	      case 1:
	    	  broken = false;
	    	  break;
	      case 2:
	    	  broken = true;
	    	  break;
	      default:
	    	  System.out.println("Error, plz enter a valid option!");
	    	  isTheBoxBroken();
	      }
	  }

	//# Parameters of output!
	  static void print(int value){
		  System.out.println( "This is a BOX = " + value );
	  }
		
	  static void printIsTheBoxBig(int value){
		  if( value > 1000 ){
			  System.out.println( "This is a BIG BOX" );
		  }else{
			  System.out.println( "This is a SMALL BOX" );
		  }
	  }
		
	  static void printIsTheBoxOk(){
		  if( broken ){
			  System.out.println( "The BOX is BROKEN!" );
		  }else{
			  System.out.println( "The BOX is OK!" );
		  }
	  }
	  
	  static void printBoxSize(int lenght, int width, int height){
		  System.out.println("The size of the BOX is: " + lenght + "cm x " + width + "cm x " + height + "cm." );
	  }

	  static void printBoxVolume(int volume){
		  System.out.println("The VOLUME of the BOX is: " + volume + "cm3.");
	  }	
}
