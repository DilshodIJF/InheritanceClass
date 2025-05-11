package Electronics;

public class Computers extends Electronics{
    private  String load = "kerakli ilovalarni yuklab olish imkoniyati";
    private  String triger = "Yonish fukciyasi";

    public String getLoad() {
return load;
    }
    public void setLoad(String load){
        this.load = load;
    }
    public String getTriger (){
        return triger;
    }
    public void setTriger(String triger){
        this.triger = triger;
    }
}
