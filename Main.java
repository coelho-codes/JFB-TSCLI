class Main {
    public static void main(String args[]) {
        Character david = new Character();
        
        david.age = 22;
        david.height = 5.9;
        david.weight = 198;
        david.name = "David"; //This is kind of redundant right now lol

        System.out.print("David says: Hello, I'm " + david.name + "!");
        System.out.print(" I'm " + david.age + " years old.");
        System.out.print(" My weight is " + david.weight + " pounds,");
        System.out.println(" and my height is about " + david.height + "ft.");
        System.out.println("This could be the start of something great!");
    }
}