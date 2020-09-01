class Dog extends Mammal
        {
        public Dog()
                {
                legs = 4;
                hasFur = true;
                }
                
        // You must fill in the base methods since this isn't an abstract class.
        public void Speak()
                {
                System.out.println("Bark.");
                }
                
        public void Eat()
                {
                System.out.println("I eat bones.");
                }
        
        }