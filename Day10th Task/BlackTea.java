package Day10Task;

//black tea subclass
public class BlackTea extends Tea {
@Override
public void prepareTea() 
{
   if (!isPrepared) {
       System.out.println("Preparing black tea with hot water and black tea leaves.");
       System.out.println("Brewing time: 5 minutes");
       isPrepared = true;
   } else {
       System.out.println("Black tea has already been prepared.");
   }
}
}
