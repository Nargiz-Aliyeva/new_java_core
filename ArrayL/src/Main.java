import java.util.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//
//      Scanner scanner = new Scanner(System.in);
//        System.out.println("write fruit");
//        String fruit = scanner.next();
//        ArrayList<String>list = new ArrayList<>();
//        list.add("apple");
//        list.add("piece");
//        list.add("banana");
//        if (list.contains(fruit)){
//            list.remove(fruit);
//
//        }else {
//            list.add(fruit);
//        }
//        System.out.println(list);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("remove fruit");
//        String fruit = scanner.next();
//        ArrayList<String> list = new ArrayList<>();
//        list.add("alma");
//        list.add("armud");
//        list.add("banan");
//        if (list.contains(fruit)) {
//            list.remove(fruit);
//        }
//        System.out.println(list);
//
//        Human human = new Human("Samra","Aliyeva",22,167,65,false);
//        Human human1 = new Human("Adil","Aliyev",23,160,75,true);
//        Human human2 = new Human("Sam","Aliyev",26,167,65,true);
//        Human human3 = new Human("Nargiz","Aliyeva",24,167,65,false);
//        Human human4 = new Human("Rauf","Aliyev",58,167,65,true);
//        ArrayList<Human> humanList= new ArrayList<>();
//        humanList.add(human);
//        humanList.add(human1);
//        humanList.add(human2);
//        humanList.add(human3);
//        humanList.add(human4);
//        float avg = 0f;
//        for (Human nergiz:humanList ){
//            avg+= nergiz.getAge();
//        }
//        System.out.println(avg/humanList.size());
//

//int avg = 0;
//
//        for (Human nergiz : humanList) {
//
//avg+= nergiz.getAge();
//        }
//        System.out.println(avg / humanList.size());
//
//    int avg =0;
//    for (Human nergiz:humanList){
//        avg+= nergiz.getAge();
//
//        }
//        System.out.println(avg/humanList.size());

//       double avg=0;
// for (Human nergiz: humanList){
//     avg+= nergiz.getAge();
// }
//        System.out.println(avg/humanList.size());

        //   Scanner scanner = new Scanner(System.in);
//        System.out.println("write fruit");
//        String fruit = scanner.next();
//        ArrayList<String>list = new ArrayList<>();
//        list.add("apple");
//        list.add("piece");
//        list.add("banana");
//        if (list.contains(fruit)){
//            list.remove(fruit);
//
//        }else {
//            list.add(fruit);
//        }


//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Write name");
//        String name = scanner.next();
//        TreeSet<String>myList= new TreeSet<>();
//        myList.add("Vusal");
//        myList.add("Taleh");
//        myList.add("Aytac");
//        myList.add("Nergiz");
//        myList.add("Ramazan");
//        myList.add("Togrul");
//        if (myList.contains(name)){
//            myList.remove(name);
//            //System.out.println(name);
//        }else {
//            myList.add(name);
//        }
//        System.out.println(myList);


//
//        Scanner scanner = new Scanner(System.in);
//
//
//        Set<String> myList= new HashSet<>();
//
//        while (true){
//            System.out.println("Write fruit name");
//            String name = scanner.next().trim();
//
//            if (name.equals("stop")){
//                break;
//            }
//            if(name.isEmpty()){
//                System.out.println("Bos ad daxil edilmez");
//            }
//            if (myList.contains(name)) {
//                System.out.println("it's alredy has");
//
//            } else {
//                myList.add(name);
//                System.out.println("Meyve elave olundu" + name);
//            }
//        }
//        System.out.println("Daxil olunmus meyveler");
//        for (String n:myList) {
//            System.out.println(n);
//        }


//        List<Integer> myLis = new ArrayList<>();
//
//        myLis.add(1);
//        myLis.add(2);
//        myLis.add(3);
//        myLis.add(4);
//        myLis.add(1);
//        myLis.add(2);
//
//        Set<Integer> yoxlama = new HashSet<>();
//        Set<Integer> tekrarlanan = new HashSet<>();
//        for (Integer n : myLis) {
//            if (!yoxlama.add(n)) {
//                tekrarlanan.add(n);
//
//            }
//        }
        //     System.out.println(tekrarlanan);

        //}
//}
//        Set<Integer> ilkSet = new HashSet<>();
//        Set<Integer> ikinciSet = new HashSet<>();
//        ilkSet.add(1);
//        ilkSet.add(2);
//        ilkSet.add(3);
//        ilkSet.add(4);
//        ikinciSet.add(5);
//        ikinciSet.add(6);
//        ikinciSet.add(7);
//        ikinciSet.add(1);
//        ikinciSet.add(2);
//ilkSet.retainAll(ikinciSet);
//        System.out.println(ilkSet);


        //--------------------------
        /*
        Set<String> ilkSet = new HashSet<>();
        Set<String> ikinciSet = new HashSet<>();
        ilkSet.add("nergiz");
        ilkSet.add("e");
        ilkSet.add("r");
        ilkSet.add("g");
        ilkSet.add("i");
        ilkSet.add("z");
        ikinciSet.add("nergiz");
        ikinciSet.add("k");
        ikinciSet.add("h");
        ikinciSet.add("n");
        ilkSet.retainAll(ikinciSet);
        System.out.println(ilkSet);

*/


        Set<String>name = new HashSet<>();
        Set<String>name2 = new HashSet<>();
        name.add("nergiz , ");
        name.add("nigar");
        name.add("n");
        name.add("r");
        name2.add("Rauf");
        name2.add("nergiz") ;
        name2.add("r");
name.retainAll(name2);
        System.out.println(name);




        Set<String>named = new HashSet<>();
        Set<String>named2 = new HashSet<>();
        Set<String>named3 = new HashSet<>();
        named.add("nergiz , ");
        named.add("nigar");
        named.add("n");
        named.add("r");
        named2.add("Rauf");
        named2.add("nergiz") ;
        named2.add("r");
        named3.add("nergiz");
        named3.add("l");
        named3.add("Rauf");
        

    }
}
