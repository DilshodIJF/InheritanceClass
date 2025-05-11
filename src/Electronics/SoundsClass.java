package Electronics;

public class SoundsClass extends Electronics{
   private   String volume = "Normal";
   private  String bass = "Max";
   public String getVolume(){
       return volume;
   }
   public void setVolume(String volume){
       this.volume = volume;
   }
   public String getBass(){
       return bass;
   }
   public void setBass(String bass){
       this.bass = bass;
   }
}
