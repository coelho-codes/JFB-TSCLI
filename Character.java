class Character {
    String name;
    int age;
    double height; //in feet
    double weight; //in pounds
    String skinColor; //white, brown or black(for the sake of simplicity)
    String eyesColor; //blue, brown, green
    String hairSize; //Big(reaching shoulders or below), medium(above the shoulders or short) and short(short to bald)

    Character(String name, int age, double height, double weight, String skinColor, String eyesColor, String hairSize) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.skinColor = skinColor;
        this.eyesColor = eyesColor;
        this.hairSize = hairSize;
    }
}