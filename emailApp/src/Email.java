import java.util.Locale;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private String email;
    private int defaultPasswordlength=10;
    private String companySuffix = "sunpro.com.sg";

    public Email (String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordlength);
        System.out.println("Your Password is: "+this.password);

        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
    }
    private String setDepartment() {
        System.out.println("New Worker " + firstName + ". Department code:\n1 for sale\n2 for developement\n3 for accounting\n0 for none\n Enter Department code: ");
        Scanner in = new Scanner(System.in);
        int enterDepCode = in.nextInt();
        if (enterDepCode == 1) {
            return "sale";
        } else if (enterDepCode == 2) {
            return "dev";
        } else if (enterDepCode == 3) {
            return "acc";
        } else {
            return " ";
        }
    }
    private String randomPassword(int length){

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@$%";
        char [] password = new char[length];
        for (int i=0;i<length;i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name: "+firstName+" "+ lastName+"\nCompany Email: "+email+"\nMailbox Capacity: "+mailboxCapacity+"mb.";
    }
}
