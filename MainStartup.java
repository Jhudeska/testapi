import java.util.ArrayList;

class MainStartup
        {
        public static void main(String[] args)      
                {
                System.out.println("Program began.");

                // Basic arrays. Don't use them. 
                // You MUST initialize the array with it's values to use it. Lame.
                int[] myArray = { 0, 1, 2 };
                myArray[0] = 5;
                System.out.println(myArray[0]);
                
                        
                // Arraylists. These are our basic arrays.
                ArrayList<Integer> myList = new ArrayList<Integer>();
                
                // Add the numbers 0, 1, ..., 9 to the list.
                for(int i = 0; i < 10; i++)
                        {
                        myList.add(i);
                        }
                
                // Access the numbers and print them out.
                int n = myList.size();
                for(int i = 0; i < n; i++)
                        {
                        int num = myList.get(i);
                        System.out.print(num + " ");
                        }
                System.out.println();
                        
                // Other types.
                ArrayList<Long> longList;
                ArrayList<Double> doubleList;
                ArrayList<Boolean> boolList;
                ArrayList<Character> charList;
                ArrayList<String> stringList;

                System.out.println("Program ended.");
                }
        }