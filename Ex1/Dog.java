/* 
class Dog{
    String name, says;
    public static void main(String[] args){
        Dog dog = new Dog();
        // dog.name = "scruffy";
        switch(dog.name){
            case "sport":
                System.out.println("Ruff!");
                break;
            case "scruffy":
                System.out.println("Wurf!");
                break;
            default:
                System.out.println("Non-Existent!");
        }
 
    }
}
*/

class Dog{
    String name;
    String says;
    Dog(String name, String says){
        this.name = name;
        this.says = says;
        System.out.println("Dog's name: " + name);
        System.out.println("They say: " + says);
    }

    public static void main(String[] args){
        Dog dog1 = new Dog("sport", "Ruff!");
        System.out.println("---+---+---");
        Dog dog2 = new Dog("scruffy", "Wurf!");
    }
}