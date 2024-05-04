//Question Number:4
package Day10Task;
public class Account {
double balance;
int withdrawan,deposit;
public Account(double b,int wd)
{
	balance=b;
	withdrawan=wd;
}
public Account()
{
	balance=5000;
	withdrawan=2000;
	deposit=1000;
}
void withdrawn()
{
    if (balance >= withdrawan) {
        System.out.println( " withdrawn "
                           + withdrawan);

        balance = balance - withdrawan;
        System.out.println("Balance after withdrawal: "
                           + balance);
    }
        
    // If the money requested for withdrawal is greater
    // than the balance then deny transaction*/
    else {

        // Print statements
        System.out.println(" you can not withdraw "
                           + withdrawan);

        System.out.println("your balance is: " + balance);
    }
}
        
        
// Method - to deposit money
// Accept money whenever deposited
void deposit()
{
    System.out.println(" deposited " + deposit);
    balance = balance + deposit;
    System.out.println("Balance after deposit: "
                       + balance);
}
// Main method
public static void main(String[] args)
{
    // Declaring an object of Bank class and calling the
    // withdarwn and deposit methods with suitable
    // parameters

    // Creating object of class 1 inside main()
    Account ac = new Account();

    // Custom input - Transactions
    System.out.println("The Initial Balance is : "+ ac.balance);
    ac.withdrawn();
    ac.deposit();
    
}
}