package Electronics;

import Doctor.SurgeonClass;

public class SubwooferClass extends SurgeonClass {
    private  String mute = "Ovoz o'chirildi";
    private String gain =  "ovozni kuchlantirish";
    public String getMute(){
        return mute;
    }
    public  void  setMute(String mute){
        this.mute = mute;
    }
    public String getGain(){
        return gain;
    }
    public void setGain(String gain){
        this.gain = gain;
    }
}
