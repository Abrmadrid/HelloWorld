package Account;

public class Account{
    private String name;
    private String surname;
    private int phoneNumber;
    private double balance;
    // Constructor values
    public Account(){
        name= " Andrez Brenn";
        surname = " Madrid ";
        phoneNumber = 555826171;
        balance = 1000.00;
    }
    // Methods
    public void display(){
        String Name = name;
        String Surname = surname;
        int PhoneNumber = phoneNumber;
        double Balance = balance;
        System.out.println("Surname: "+ Surname);
        System.out.println("Name: " + Name);
        System.out.println("Phone Number: " + PhoneNumber);
    }
    public void adddeposit(double ammount){
        double result = ammount + balance;
        System.out.println("Your Balance is :" + result);
    }
    public void withdraw(double ammount){
        double result =  balance - ammount;
        System.out.println("You balance is now :" + result);
    }
    public double getBalance(){
        return balance;
    }

}