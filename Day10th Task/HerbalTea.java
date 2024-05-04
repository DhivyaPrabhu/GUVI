package Day10Task;

//herbal tea subclass
public class HerbalTea extends Tea {
@Override
public void prepareTea() {
    if (!isPrepared) {
        System.out.println("Preparing herbal tea with hot water and herbal tea ingredients.");
        System.out.println("Brewing time: 7 minutes");
        isPrepared = true;
    } else {
        System.out.println("Herbal tea has already been prepared.");
    }
}
}
