//**
  /* Write a description of class PersonCreator here.
  * 
  * @author (your name) 
   * @version (a version number or a date)
   */
  public class PersonCreator
 {
   // Your class begins here!
   // Name of the person
   private String name;
   // Age of the person
   private int age; 
   // Sex of the person
   private String sex;
   // Height of the person
   private int height;
   // Weight of the person
   private int weight;
   // SSN of the person
   private String SSN;
   // Address of the person
   private String address;
   //phoneNum of the person
   private String phoneNum;
   private int first, second, third;
   //DOB of the person
   private String DOB;
     
     //this makes the person and allows you to input your choice of first and last name
   public void PersonCreator( String firstname, String lastname){
         name=firstname+" "+lastname;
   }
     // This allow the user to set a name
   public void setName(String newName){
         name=newName;
   }
     // Allow the user to set the age of the person
   public void setAge( int newAge) {
         age=newAge;
   }
     //Allow user to define the person's sex
   public void setSex( String newSex) { 
         sex=newSex;
   }
     //Allows user to input height
   public void setHeight( int newHeight) {
         height=newHeight;
   }
     // allow user to input weight
   public void setWeight( int newWeight) {
         weight=newWeight;
   }
     //allows user to input s
   public void setSSN(String newSSN) {
         SSN=newSSN;
         if (first<=100&&first>=999){
             if(second<=10&&second>=99){
                 if(third<=1000&&third>=9999) {
                     newSSN= first + "-" + second+ "-" + third;
                 }
             }
          } 
   }
   public void setAddress(String newaddress) {
         address=newaddress;
   }
   public void setPhoneNum(String newphoneNum) {
         phoneNum=newphoneNum;
         if(first<=100&&first>=999){
             if(second<100&&second>=999) {
                 if (third<=1000&&third>=9999){
                     newphoneNum= first+ "-" + second+ "-" + third;
                 }
             }
         }
  }
  public void setDOB( String newDOB){
      DOB=newDOB;
  }
  public void printPerson()
  {
      System.out.println(name);
       System.out.println(sex);
       System.out.println(age + "years");
       System.out.println(address);
       System.out.println(height + "inches");
       System.out.println(weight + "pounds");
       System.out.println(SSN);
       System.out.println(phoneNum);
       System.out.println(DOB);
  }
  }