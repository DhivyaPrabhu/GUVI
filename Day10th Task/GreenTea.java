package Day10Task;

//green tea subclass
public class GreenTea extends Tea 
{
@Override
public void prepareTea() {
 if (!isPrepared) {
     System.out.println("Preparing green tea with hot water and green tea leaves.");
     System.out.println("Brewing time: 3 minutes");
     isPrepared = true;
 } else {
     System.out.println("Green tea has already been prepared.");
 }
}
}