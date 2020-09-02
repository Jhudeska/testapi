class MainStartup
        {
        public static void main(String[] args)      
                {
                System.out.println("Program began.");

                Dog srcdog = new Dog();
                srcdog.Speak();
                srcdog.Eat();
                
                Cat srccat = new Cat();
                srccat.Eat();
                
                System.out.println("Program ended.");
                }
        }