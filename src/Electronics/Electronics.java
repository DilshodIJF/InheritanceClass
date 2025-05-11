package Electronics;

import com.sun.source.doctree.SeeTree;

public class Electronics {
    private String power = "Elektr tokiga ulandi";
    private String signal = "Ovoz chiqarish funkciyasi";;
    public String getPower(){
        return power;
    }
    public void setPower(String power){
        this.power  =   power;
    }
    public String getSignal(){
        return signal;
    }
    public void setSignal(String signal){
        this.signal = signal;
    }

}
