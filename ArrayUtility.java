// Copyright srcmake.com 2018.
// Generics Class/Method.
// Reference: https://www.tutorialspoint.com/java/java_generics.htm
public class ArrayUtility
        {
        public static <T> void PrintArray(T[] array)
                {
                for(T element : array)
                        {
                        System.out.print(element + " ");
                        }
                System.out.println();
                }
        }