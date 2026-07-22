package OOPS;

class Pokemon{
    int power;
    String type;
    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }

    Pokemon(){}

    void print(){
        System.out.println(this.power + " " + this.type);
    }
}

class StrongPokemon extends Pokemon{     // Child Class - Single Inheritance
    int speed;
}

class LegendaryPokemon extends Pokemon{ 
    String ability;
}

class GodPokemon extends LegendaryPokemon{
    char tag;
}

public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon newtwo = new LegendaryPokemon();
        newtwo.ability = "Pressure";

    }
}
