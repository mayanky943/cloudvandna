import java.util.*;
import java.io.*;
class Java1{
	public static void main(String[] args) throws IOException{
		// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc=new Scanner(System.in);
		Integer[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, originalArray);

        Collections.shuffle(list);

        Integer[] shuffledArray = list.toArray(new Integer[0]);

        for (Integer num : shuffledArray) {
            System.out.print(num + " ");
        }
	}
}