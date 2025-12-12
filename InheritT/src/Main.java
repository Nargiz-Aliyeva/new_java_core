//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//   public static void main(String[] args) {
////          Dog rex = new Dog("black",4,"Rex","it hurur");
//        Cat Luna = new Cat("white",4,"Luna");

    /// /        System.out.println(rex);
//
//        Animal[] animals = {rex,Luna};
//        for (int i = 0; i < animals.length; i++) {
//            System.out.println(animals[i]);
//        }
//
    public static void main(String[] args) {

        Human nergiz = new Human("Nargiz","Aliyeva",24);
        Human taleh = new Human("Taleh","Agayev", 35);
        Human[]humans={taleh,nergiz};
        for (int i=0 ; i< humans.length;i++){
            if(humans[i].getAge() > 27){
                humans[i].setAge(humans[i].getAge()-1);
            }
            System.out.println(humans[i]);

        }
    }

}


































/*
for (int i = 0; i < humans.length; i++) {
            if(humans[i].getAge() > 27){
                humans[i].setAge(humans[i].getAge() + 1);
                System.out.println(humans[i]);
            }
        }
 */