public class DoctorClass{
    private String diagnose = "Sizni davolashimiz uchun tashxis qo'yishimiz kerak";
    private  String treat = "Biz sizni davolaymiz";
    public void welcome (){
    System.out.println("Salom Doktor ko'rigiga xush kelibsiz");
    }
    public String getDiagnose(){
        return diagnose;
    }
    public void setDiagnose(String diagnose){
        this.diagnose = diagnose;
        System.out.println(diagnose);
    }
    public String getTreat(){
        return treat;
    }
    public void setTreat(String treat){
        this.treat = treat;
        System.out.println(treat);
    }

}