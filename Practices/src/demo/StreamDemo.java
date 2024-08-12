package demo;
import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer> numbersList = new ArrayList<>();
  numbersList.add(10);
  numbersList.add(20);
  
//  List<Integer>squareList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
 Set <Integer> squareList =numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
  
  System.out.println("Squares are : " + squareList);
  
  List<String>lang =new ArrayList<>();
  lang.add("Python");
  lang.add("Java");
  lang.add("C#");
  lang.add("Scala");
  
  List<String>filterResult = lang.stream().filter(s -> s.startsWith("P")).collect(Collectors.toList());
  
  System.out.println(" Languages is : " + filterResult);
  
  List <String>sortedList = lang.stream().sorted().collect(Collectors.toList());
  
  System.out.println( "Sorted List is : " + sortedList);
  
  
  lang.stream().forEach(y -> System.out.println( " Languages are :" +y));  
  
  int sum = numbersList.stream().reduce(0, (ans,i) -> ans+i);
  
  System.out.println("Sum  : "+ sum);
  
  
	}

}
