package emailapp;


import java.util.Scanner;

public class Email
{
    private String firstName;
    private String lastName;
   private String password;
   private String company="xyz";
    private String department;
    private int length=4;
    private String emailid;
    private int emailboxCapacity;
    private String alternateEmail;
    //constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("email created: "+ this.firstName+" "+this.lastName);
        this.department=setdepartment();
        System.out.println("department:"+ this.department);
        this.password=RandomPassword(length);
        System.out.println("password: " +password);
        emailid= firstName.toLowerCase() +lastName.toLowerCase()+"@"+department.toLowerCase()+company.toLowerCase()+"com";
        System.out.println("email id : "+emailid);
        
    }
    //ask for department
    private String setdepartment(){
    System.out.println("select department: \n1 for sales\n2 for development\n3 for accounts ");
    Scanner iin=new Scanner(System.in);
    int deptchoice =iin.nextInt();
    if(deptchoice==1){return "sales";}
    else if(deptchoice==2){return "dev";}
    else if(deptchoice==3){return "acc";}
    else {return "";}
    
    }

    //set romdom password
    private String RandomPassword(int length){
        String passwordset="abcdefghijklmnopqrstwxyz!@#$%";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
           int rant=(int)(Math.random() * passwordset.length());
            password[i]=passwordset.charAt(rant);
        } 
        return new String(password);
    }
    public void setcapacity(int capacity){
        this.emailboxCapacity=capacity;
    }
    public void setalteremail(String alteremail)
    {this.alternateEmail=alteremail;
    }
    public void changepassword(String chpassword){
        this.password=chpassword;
    }
}