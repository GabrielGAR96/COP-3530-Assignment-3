import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		UnbalancedTreeMap map = new UnbalancedTreeMap();
		
		TreeMap map2 = new TreeMap();
		
		long startTime = System.nanoTime();
		long totalTime = 0;
		String word;
		
		Scanner scanner;
		
		for(int i = 1; i<=77;i++)	{
		scanner = new Scanner(new File("src/HCAndersen Tales/"+i+".okpuncs"));
		startTime = System.nanoTime();
		word = scanner.toString();
		map.put(word, 1+map.get(word));
		totalTime += System.nanoTime()-startTime;
		}
		
		System.out.println(map.keySet()[59]);
		
		System.out.println("Total time for UnbalancedTreeMap: " + totalTime);

		for(int i = 1; i<=77;i++)	{
			scanner = new Scanner(new File("src/HCAndersen Tales/"+i+".okpuncs"));
			startTime = System.nanoTime();
			word = scanner.toString();
			map2.put(word, 1+map.get(word));
			totalTime += System.nanoTime()-startTime;
			}
		System.out.println("Total time for TreeMap: " + totalTime);

	}

}
