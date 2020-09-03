// Copyright srcmake.com 2018.
// Reference: https://www.tutorialspoint.com/java/java_generics.htm
class GenericClass<T>
        {
        private T somevariable;
        
        public void PrintT(T element)
                {
                System.out.println(element);
                somevariable = element;
                }
        }