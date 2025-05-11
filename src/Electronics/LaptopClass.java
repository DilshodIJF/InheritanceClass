package Electronics;

public class LaptopClass extends Computers{
    private String charging = "Noutbook zaryadka olmoqda";
    private Float memory = 135.2F;
    public String getCharging(){
        return charging;
    }
    public void setCharging(String charging){
        this.charging = charging;
    }
    public Float getMemory(){
        return memory;
    }
    public void setMemory(Float  memory){
        this.memory = memory;
    }
}
