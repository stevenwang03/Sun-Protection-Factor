import java.lang.Math;

public class SPF {
    
    private int SPF;
    private int burnTimeMins;
    private int protectionUVB;
    
    public SPF (int SPF, int burn) {
    
    this.SPF = SPF;
    burnTimeMins = burn;
    
    }
    
    public void sunscreenTime() {

        burnTimeMins *= 10;
    
    }
    
    public void precentUVB() {
        
        protectionUVB = (int)(70.0648141 + (7.10865905 * Math.log(SPF)));
        
        if (protectionUVB >= 100) {
            protectionUVB = 99;
        }
        
    }
    
    public String getUVB() {
        
        return "With SPF " + SPF + ", you will have a " + protectionUVB +"% protection against UVB rays.";
        
    }
    
    public String getBurnTime() {
        
        return "With SPF " + SPF + ", you will burn in around " + burnTimeMins + ".";
        
    }
    
}
