//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        mercedes mercedes = new mercedes("c200", "silver");
        mercedes mercdes2= new mercedes("c3000","Black");
        mercedes mercedes3= new mercedes("c400","yellow");
        mercedes[]merclist = {mercedes,mercdes2,mercedes3};
        for (int i = 0; i < merclist.length; i++) {
//            merclist[i].displayInfo();
       if (merclist[i].getColor().equals("Black")){
                     merclist[i].displayInfo();

       }


        }
//        mercedes.displayInfo();



    }
}