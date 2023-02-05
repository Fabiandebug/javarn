import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Please enter a number:");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//
//        System.out.println("The answer is:"+answer);
//
//        System.out.println("Please enter your name");
//
//        String name = scanner.next();
//
//        System.out.println("Your name is:"+name);
//
//
//        System.out.println("End");
//
////Arrays
//
//        String[] students= new String[5];
//        students[1]="Evas";
//        students[0]="Maish";
//        System.out.println(students[1] +" "+students[0]);
//
//        Phone Iphone = new Phone();
//
//        Iphone.name ="Iphone 12 pro max";
//        Iphone.memorysize=10;
//        Iphone.camera=20;
//        Iphone.screensize=6;
//
//        Iphone.playmusic("Show your back");

//        ArrayList<String> names= new ArrayList<>();
//        names.add("Evans");
//        names.add("Maina");
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
//
//        names.remove("Evans");
//        System.out.println(names.contains("Maina"));
//
//
//        System.out.println(names.size());
//        Map<String,String> emaillist = new HashMap<>();
//
//        emaillist.put("Evans","evans@gmail.com");
//        emaillist.put("ida","ida@gmail.com");
//        emaillist.put("mum","mum@gmai.com");
//
//        System.out.println(emaillist.get("Evans"));
//
//
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("evans",1));
//        students.add(new Student("maina",2));
//        students.add(new Student("kk",3));
//        students.add(new Student("ss",4));
//
//        for (Student s: students){
//            System.out.println(s.getId()+ " " + s.getName());
//        }

      Carinterface carinterface = new ElectricCar();
      carinterface.start();
      carinterface.move(100);

    }
}