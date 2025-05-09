//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LorClass lorClass = new LorClass( "Sizni quloq, burun va tomog'ingizni ko'zdan kechiramiz", " Sizni tomogingizda shomollash bor");
        SurgeonClass surgeonClass = new SurgeonClass();
        lorClass.welcome();
        lorClass.ask();
        System.out.println(lorClass.getDiagnose());
        System.out.println(lorClass.getExamnine());
        System.out.println(lorClass.getAssess());
        System.out.println(lorClass.getTreat());
        System.out.println("____________________________________");//Surgion klasni ajratish uchun
        System.out.println("Xirurg ko'rigi");
        surgeonClass.welcome(); // super klass
        System.out.println(surgeonClass.getDiagnose());
        System.out.println(surgeonClass.getInspect());
        System.out.println(surgeonClass.getAsk());
        System.out.println(surgeonClass.getOperate());

    }
}