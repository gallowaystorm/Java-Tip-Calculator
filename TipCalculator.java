
public class TipCalculator {
    private double billAmt;
    private double percent;
    private double numOfPeople;
    private double tipAmt;
    
    public TipCalculator(double billAmt,double percent,double numOfPeople){
        this.billAmt = billAmt;
        this.percent = percent;
        this.numOfPeople = numOfPeople;
    }
    
    public void calculateTip(){
        tipAmt = (billAmt * percent) / numOfPeople;
        System.out.println(tipAmt);
    }
}
