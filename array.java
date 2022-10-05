// Task 1
// import java.util.ArrayList;
// class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> cars = new ArrayList<String>();
// 		cars.add("Mercedes");
// 		cars.add("BMW");
// 		cars.add("Audi");
// 		cars.add("Maserati");
// 		System.out.println(cars);
// 	}
// }


// Task 2
// import java.util.ArrayList;
// class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> cars = new ArrayList<String>();
// 		cars.add("Mercedes");
// 		cars.add("BMW");
// 		cars.add("Audi");
// 		cars.add("Maserati");
// 		for(int i = 0;i<cars.size();i++){
// 			System.out.println(cars.get(i));
			

// 		}
// 	}
// }


// Task 3
// import java.util.ArrayList;
// class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> cars = new ArrayList<String>();
// 		cars.add("Mercedes");
// 		cars.add("BMW");
// 		cars.add("Audi");
// 		cars.add("Maserati");
// 		for(String i:cars){
// 			System.out.println(i);
// 		}
// 	}
// }



// Task 4
// import java.util.ArrayList;
// class array{
// 	public static void main(String[] args) {
// 		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
// 		myNumbers.add(15);
// 		myNumbers.add(115);
// 		myNumbers.add(152);
// 		myNumbers.add(155);
// 		for(Integer i:myNumbers){
// 			System.out.println(i);
// 		}
// 	}
// }


// Task 5
// import java.util.Collections;
// import java.util.ArrayList;
// class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> cars = new ArrayList<String>();
// 		cars.add("Mercedes");
// 		cars.add("Maserati");
// 		cars.add("Audi");
// 		cars.add("Volvo");
// 		Collections.sort(cars);
// 		for(String i:cars){
// 			System.out.println(i);
// 		}
// 	}
// }


// Task 6
// import java.util.Collections;
// import java.util.ArrayList;
// class array{
// 	public static void main(String[] args) {
// 		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
// 		myNumbers.add(2111);
// 		myNumbers.add(1111);
// 		myNumbers.add(4111);
// 		myNumbers.add(8111);
// 		Collections.sort(myNumbers);
// 		for(Integer i:myNumbers){
// 			System.out.println(i);
// 		}
// 	}
// }


// Task 7
// import java.util.ArrayList;

// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> cars = new ArrayList<String>();
// 		cars.add("Mercedes");
// 		cars.add("Maserati");
// 		cars.add("Mazda");
// 		cars.add("Nissan");
// 		System.out.println(cars);


// 		String car = cars.get(0);
// 		System.out.println("get method: " +car);


// 		cars.set(0,"Opel");
// 		System.out.println("set method: "+ cars);

// 		cars.remove(0);
// 		System.out.println("remove method: "+ cars);

// 		cars.clear();
// 		System.out.println("clear method: "+cars);

// 		int s = cars.size();
// 		System.out.println(s);
// 	}
// }


// PROBLEM SOLVING PRACTISE
// Problem 1
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> colors = new ArrayList<String>();
// 		colors.add("Black");
// 		colors.add("White");
// 		System.out.println(colors);
// 	}
// }


// Problem 2
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> computers = new ArrayList<String>();
// 		computers.add("hp");
// 		computers.add("lenovo");
// 		System.out.println(computers);
// 		computers.add(0,"asus");
// 		System.out.println(computers);
// 	}
// }



// Problem 3
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> smth = new ArrayList<String>();
// 		smth.add("smth1");
// 		smth.add("smth3");
// 		smth.add("smth4");
// 		String smth1 = smth.get(0);
// 		System.out.println(smth1);
// 	}
// }



// Problem 4
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> smth = new ArrayList<String>();
// 		smth.add("smth1");
// 		smth.add("smth3");
// 		smth.add("smth4");
// 		String smthadd = "SOMETHING";
// 		smth.set(1,smthadd);
// 		System.out.println(smth);
// 	}
// }


// Problem 5
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> smth = new ArrayList<String>();
// 		smth.add("smth1");
// 		smth.add("smth3");
// 		smth.add("smth4");
// 		String smthadd = "SOMETHING";
// 		smth.set(1,smthadd);
// 		smth.remove(0);

// 		System.out.println(smth);

// 	}
// }



// Problem 6
// import java.util.Collections;
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> smth = new ArrayList<String>();
// 		smth.add("amth");
// 		smth.add("mmth");
// 		smth.add("triple");
// 		smth.add("xxxx");
// 		smth.add("basix");
// 		smth.add("bask");
// 		smth.add("aleke");

// 		String smthadd = "SOMETHING";
// 		smth.set(1,smthadd);
// 		String tofind = "aleke";
// 		boolean tofind2 = smth.contains(tofind);
// 		if(tofind2) System.out.println("CONTAINS");
// 		else System.out.println("NOT CONTAINS");
// 		System.out.println(smth);
// 	}
// }


// Problem 7
// import java.util.Collections;
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> smth = new ArrayList<String>();
// 		smth.add("amth");
// 		smth.add("mmth");
// 		smth.add("triple");
// 		smth.add("xxxx");
// 		smth.add("basix");
// 		smth.add("bask");
// 		smth.add("aleke");

// 		String smthadd = "SOMETHING";
// 		smth.set(1,smthadd);
		
// 		ArrayList<String> smth_Second = new ArrayList<String>(smth);

// 		System.out.println(smth_Second);
// 	}
// }


// Problem 8
// import java.util.Collections;
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> smth = new ArrayList<String>();
// 		smth.add("amth");
// 		smth.add("mmth");
// 		smth.add("triple");
// 		smth.add("xxxx");
// 		smth.add("basix");
// 		smth.add("bask");
// 		smth.add("aleke");

// 		String smthadd = "SOMETHING";
// 		smth.set(1,smthadd);
		
// 		ArrayList<String> smth_Second = new ArrayList<String>(smth);
// 		Collections.shuffle(smth_Second);
// 		System.out.println(smth_Second);
// 	}
// }


// Problem 9
// import java.util.Collections;
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> smth = new ArrayList<String>();
// 		smth.add("amth");
// 		smth.add("mmth");
// 		smth.add("triple");
// 		smth.add("xxxx");
// 		smth.add("basix");
// 		smth.add("bask");
// 		smth.add("aleke");

// 		String smthadd = "SOMETHING";
// 		smth.set(1,smthadd);
		
// 		ArrayList<String> smth_Second = new ArrayList<String>(smth);
// 		Collections.sort(smth_Second,Collections.reverseOrder());
// 		System.out.println(smth_Second);
// 	}
// }



// BONUS **********************************************

// PRoblem 1
// import java.util.Scanner;
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		int first_index = in.nextInt();
// 		int second_index = in.nextInt();
// 		ArrayList<String> arrayss = new ArrayList<String>();
// 		arrayss.add("just");
// 		arrayss.add("sometimes");
// 		arrayss.add("someone");
// 		arrayss.add("yet");
// 		arrayss.add("already");
// 		arrayss.add("bit");
// 		arrayss.add("little");
// 		arrayss.add("something");
// 		arrayss.add("usually");
// 		arrayss.add("confident");
// 		for(int i = 0;i < arrays.size();i++){
// 			String item = arrayss.get(i);
// 			if(i>first_index && i<second_index){
// 				System.out.println(item);
// 			}
// 		}
		
// 	}
// }



// Problem 2
// import java.util.Scanner;
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		ArrayList<String> first_array = new ArrayList<String>();
// 		ArrayList<String> second_array = new ArrayList<String>();
// 		first_array.add("just");
// 		first_array.add("sometimes");
// 		first_array.add("someone");
// 		first_array.add("yet");
// 		first_array.add("already");
// 		second_array.add("bit");
// 		second_array.add("little");
// 		second_array.add("something");
// 		second_array.add("usually");
// 		second_array.add("confident");
// 		second_array.add("lemon");
// 		second_array.add("surprisingly");
// 		second_array.add("actually");
// 		if(first_array.size()>second_array.size()){
// 			System.out.println("first_array is bigger");
// 		}else if(first_array.size()==second_array.size()){
// 			System.out.println("Equal arrays");
// 		}else{
// 			System.out.println("second_array is bigger");
// 		}
// 	}
// }


// Problem 3
// import java.util.Scanner;
// import java.util.Collections;
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		ArrayList<String> first_array = new ArrayList<String>();
// 		ArrayList<String> second_array = new ArrayList<String>();
// 		first_array.add("just");
// 		first_array.add("sometimes");
// 		first_array.add("someone");
// 		first_array.add("yet");
// 		first_array.add("already");
// 		second_array.add("bit");
// 		second_array.add("little");
// 		second_array.add("something");
// 		second_array.add("usually");
// 		second_array.add("confident");
// 		second_array.add("lemon");
// 		second_array.add("surprisingly");
// 		second_array.add("actually");
// 		System.out.println("Before swapping: " + first_array);
// 		Collections.swap(first_array,2,4);
// 		System.out.println("After swapping: "+first_array);
// 	}
// }'


// Problem 4
// import java.util.Scanner;
// import java.util.ArrayList;
// public class array{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		ArrayList<String> first_array = new ArrayList<String>();
// 		ArrayList<String> second_array = new ArrayList<String>();
// 		first_array.add("just");
// 		first_array.add("sometimes");
// 		first_array.add("someone");
// 		first_array.add("yet");
// 		first_array.add("already");
// 		second_array.add("bit");
// 		second_array.add("little");
// 		second_array.add("something");
// 		second_array.add("usually");
// 		second_array.add("confident");
// 		second_array.add("lemon");
// 		second_array.add("surprisingly");
// 		second_array.add("actually");
// 		System.out.println("Before joining two arrays : "+first_array);
// 		first_array.addAll(second_array);
// 		System.out.println("After joining two arrays : "+first_array);
// 	}
// }