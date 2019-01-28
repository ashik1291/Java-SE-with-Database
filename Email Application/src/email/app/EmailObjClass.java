
package email.app;

import java.util.Scanner;

public class EmailObjClass {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int mailboxCapacity=500;
    private String department;
    private int defaultPasswordLength = 8;
    private String alternativeEmail;
    
    // contructor to receive Firstname and Lastname
    public EmailObjClass(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        // Ask for deparment and Set department
        this.department = setDepartment();
        
        // set random password
        this.password = randomPassword(defaultPasswordLength);
        this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+"company.com";
        
    }
    
    private String setDepartment(){
        System.out.println("Enter the department:-");
        System.out.println("1 for Sales\n2 for Development\n3 for Accounting");
        System.out.print("0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int deptCode = in.nextInt();
        if(deptCode==1){ return "sales";}
        else if(deptCode==2){ return "development";}
        else if(deptCode==3){ return "accounting";}
        else { return "";}        
    }
    
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ013456789!@#$%^&*";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;
    }
    public void setChangePassword(String newPassword){
        this.password = newPassword;
    }
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternativeEmail(){return alternativeEmail;}
    public String getChangedPassword(){return password;}
    
    public void showInfo(){
        System.out.println("Employee name: "+firstName+" "+lastName);
        System.out.println("Department: "+department);
        System.out.println("Email: "+email);
        System.out.println("Password "+password);
        System.out.println("Mailbox Capacity: "+mailboxCapacity+"mb");
    }
    
}