import java.security.PublicKey;

public class Human {
//     public void sayHi( String name){
//         System.out.println("Hello, "+ name);
//     }
//     public String sayBye(String name){
//         return name + ", BYE BYE";
//     }
//     public int returnFirstNumber(int a){
//         return a;
//     }
//     public int returnSecondNumber(int b){
//         return b;
//     }
// public String sayBye(String name){
//     return name;
// }

//public int re4turnFirstNumber(int a ){
//    return a;
//}
//public int returnSecondNumber(int b){
//    return b;
//}

/*private void sayHi (String name){
    System.out.println("hi "+ name);
}
private void sayBye(String name){
    System.out.println("bye "+ name);
}
public void reception(String name){
    sayHi(name);
    sayBye(name);
}
*/



    public Human(){



    }
    public Human(String fullName1 ,int age1 , boolean gender1 ){

        this.fullName = fullName1;
        this.age = age1;
        this.gender = gender1;

    }



    public String fullName;
    public String lastName;
    public int age;
    public boolean gender;

    public String genderCompiler(boolean gender){
        if (gender){
            return "Woman";
        }
        return "Man";
    }


    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}' ;
    }
/* buna baxxx

    public int countEvenNumbers(int[]intArray){
        int countEvenNumbers = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                countEvenNumbers++;
            }
        }
        return countEvenNumbers;
    }
    public int[] returnEvenArray(int[] intArray) {
        int[]evenArray = new int[countEvenNumbers(intArray)];
        int evenArrayIndex = 0;
        for (int i = 0; i < intArray.length ; i++) {
         if (intArray[i]%2==0){
           evenArray[evenArrayIndex]=intArray[i];
           evenArrayIndex++;
         }
        }
        return  evenArray;
    }
    public void printScreen(int[]respons){
        for (int i = 0; i < respons.length ; i++) {
        System.out.println(respons[i]);
    }}


*/






























































//    public void saYHi(String name) {
//        System.out.println("Hello, " + name);
//    }
//
//    public void sayBye(String name) {
//        System.out.println("ByeBye, " + name);
//    }
//
//    public String sayByeBye(String name) {
//return name + "bye bye";
//
//    }
//    public String sayYes(String name){
//    }
//
//    public String sayBye(String name){
//        return name +", bye bye";
//    }
//    public int returnFirstNumber(int a){
//        return a;
//    }
//    public int returnSecondNumber (int b){
//        return b;
//    }
//
//    public int[] returnEvenArray(int[]intArray){0
//        int countEvenNumbers=0;
//        for (int i = 0; i <intArray.length ; i++)
//            if (intArray[i]%2 == 0){
//                countEvenNumbers++;
//            }
//
//    int[] evenaArray = new int[countEvenNumbers];
//        for (int i = 0; i < ; i++) {
//
//        }
//
//}
//}


    }