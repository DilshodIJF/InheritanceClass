public class SurgeonClass extends DoctorClass{
    private String inspect = "Biz sizni kozdan kechiramiz";
    private String ask = "Sizni qanday shikoyatlaringiz bor";
private String operate = "Biz Sizni operaciya qilishimiz zarur";

public String getInspect (){
    return inspect;
}
public void setInspect(String inspect){
    this.inspect = inspect;
}
public String getAsk (){
    return ask;
}
public void setAsk(String ask){
    this.ask = ask;
}
public String getOperate(){
    return operate;
}
public void setOperate(String operate){
    this.operate = operate;
}
}


