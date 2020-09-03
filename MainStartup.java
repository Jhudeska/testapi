// Copyright srcmake.com 2018.
class MainStartup
        {     
        ////////////////////////////////////////////////////////////////////////
        // This method is limited and can only accept Integer arrays.
        // We'd have to overload it for Double, Long, String, Boolean, etc. arrays.
        public static void PrintArraysBad(Integer[] array)
                {
                for(int element : array)
                        {
                        System.out.print(element + " ");
                        }
                System.out.println();
                }
        ////////////////////////////////////////////////////////////////////////

        
        ////////////////////////////////////////////////////////////////////////
        public static void main(String[] args)      
                {
                System.out.println("Program began.\n");
                
                /* Generic methods */
                // We have a bunch of arrays.
                Integer[] intArray = { 0, 2, 4, 6, 8, 10 };
                Double[] doubleArray = { 1.5, 2.5, 3.5, 4.5, 5.5 };
                Long[] longArray = { 100L, 200L, 300L, 400L, 500L };
                Boolean[] boolArray = { true, true, false, true, false };
                Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
                String[] stringArray = { "Apple", "Book", "Candy", "srcmake" };
                
                // If we want to print them, it makes sense to have a function to do it
                // Since it would be cumbersome to have a bunch of for loops.
                
                // But PrintArraysBad only accepts Integer arrays....
                PrintArraysBad(intArray);
                
                // We'll use the generic class's PrintArray method instead.
                // (We don't need to instantiate an object since the methos is static.)
                ArrayUtility.PrintArray(intArray);
                ArrayUtility.PrintArray(doubleArray);
                ArrayUtility.PrintArray(longArray);
                ArrayUtility.PrintArray(boolArray);
                ArrayUtility.PrintArray(charArray);
                ArrayUtility.PrintArray(stringArray);
                
                System.out.println();
                
                /* Generic Class */
                GenericClass<Integer> intT = new GenericClass<Integer>();
                intT.PrintT(5);
                
                GenericClass<String> stringT = new GenericClass<String>();
                stringT.PrintT("src make");
                
                System.out.println("\nProgram ended.");
                }
        ////////////////////////////////////////////////////////////////////////
        }