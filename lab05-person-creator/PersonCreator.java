
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{   // Name of the person
    private String name;
    // Age of the person
    private int age; 
   // Sex of the person
    private String sex;
     // Height of the person
    private int height;
    private int weight;
    private String SSN;
    private String address;
    private String phoneNum;
    private int first, second, last;
    private int Areacode, prefix, newlast;
    private String DOB;
    
    public void PersonCreator( String firstname, String lastname){
        name=firstname+" "+lastname;
    }
    
    public void setName(String newName){
        name=newName;
    }
    public void setAge( int newAge) {
        age=newAge;
    }
    public void setSex( String newSex) { 
        sex=newSex;
    }
    public void setHeight( int newHeight) {
        height=newHeight;
    }
    public void setWeight( int newWeight) {
        weight=newWeight;
    }
    public void setSSN(String newSSN) {
        SSN=newSSN;
    }
    public void setAddress(String newaddress) {
        address=newaddress;
    }
    public void setPhoneNum(String newphoneNum) {
        phoneNum=newphoneNum;
        if (first<100 && first>999){
            Areacode=first;
        }
             if(second<100 && second>999) {
                prefix=second;}
                if (last<1000&& last>9999) {last=newlast;}
                    
    }
    public void setDOB( String newDOB){
        DOB=newDOB;
    }
}

    