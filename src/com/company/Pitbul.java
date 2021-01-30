package com.company;

public final class Pitbul extends Dog {




    private int weight;
    private String type;

    public Pitbul(String name, int age, int weight, String type,Color color,Voice voice,String breed) {
        super(name, age,color,voice,breed);
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);


        }
    }
}