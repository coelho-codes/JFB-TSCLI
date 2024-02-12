//Class representing a Sim
class Character {
    String name;
    int age;
    String gender; //male or female
    double height; //in feet
    double weight; //in pounds
    String skinColor; //white, brown or black(for the sake of simplicity)
    String eyesColor; //blue, brown, green
    String hairSize; //big(reaching shoulders or below), medium(above the shoulders or short) and short(short to bald)

    Character(String name, int age, String gender, double height, double weight, String skinColor, String eyesColor, String hairSize) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.skinColor = skinColor;
        this.eyesColor = eyesColor;
        this.hairSize = hairSize;
    }
}