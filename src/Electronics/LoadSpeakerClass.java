package Electronics;

import Doctor.SurgeonClass;
import com.sun.jdi.event.StepEvent;
import com.sun.source.doctree.BlockTagTree;

public class LoadSpeakerClass extends SurgeonClass {
    private  String balance = "Kanallar balansi";
    private String mode = "stereo";
    public String getBalance(){
        return balance;
    }
    public void setBalance(String balance){
        this.balance = balance;
    }
    public String getMode(){
        return mode;
    }
    public void setMode(String mode){
        this.mode = mode;
    }
}
