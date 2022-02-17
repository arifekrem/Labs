public class PersonTester {

    public static void main(String[] args) {
       
        Person individual = new Person("Frodo");
        
        individual.befriend(new Person("Samwise"));
        individual.befriend(new Person("Aragorn"));
        individual.befriend(new Person("Boromir"));
        
        System.out.println("Friend List: " + individual.getFriendNames());
        System.out.println("Expected: Samwise Aragorn Boromir ");
        System.out.println("Friend Count: " + individual.getFriendCount());
        System.out.println("Expected: 3");
        
        individual.unfriend(new Person("Boromir"));
        
        System.out.println("Friend List: " + individual.getFriendNames());
        System.out.println("Expected: Samwise Aragorn ");
        System.out.println("Friend Count: " + individual.getFriendCount());
        System.out.println("Expected: 2");
        
        individual.befriend(new Person("Gandalf"));
                
        System.out.println("Friend List: " + individual.getFriendNames());
        System.out.println("Expected: Samwise Aragorn Gandalf ");
        System.out.println("Friend Count: " + individual.getFriendCount());
        System.out.println("Expected: 3");
        
        individual.unfriend(new Person("Samwise"));
        
        System.out.println("Friend List: " + individual.getFriendNames());
        System.out.println("Expected: Aragorn Gandalf ");
        System.out.println("Friend Count: " + individual.getFriendCount());
        System.out.println("Expected: 2");
    }
}
