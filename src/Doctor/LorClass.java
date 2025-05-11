package Doctor;

public class LorClass extends DoctorClass {
    private String examnine;
    private  String assess;;

 public void ask(){
     System.out.println("Sizning lorga qanday shikoyatlaringiz bor?");
 }
 public String getExamnine(){
     return examnine;
 }
 public void setExamnine(String examnine){
     this.examnine = examnine;
 }
 public String getAssess(){
     return assess;
 }
 public void setAssess(String assess){
     this.assess = assess;
 }
 public LorClass(String examnine, String assess){
     this.assess = assess;
     this.examnine = examnine;
 }
}
