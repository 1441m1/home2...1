package com.company;

public class Dog extends Animal {

    private Voice voice;
    private Color color;
    private String breed;




    public Dog(String name, int age, Color color, Voice voice,String breed) {
        super(name, age);
        this.voice = voice;
        this.color = color;
        this.breed = breed;

    }


    public Voice getVoice() {
        return voice;
    }

    public Color getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }


    public final void  makeVoice(int number,String voice){
        for (int i = 0; i <number ; i++) {
            System.out.println(voice);

        }
    }
    public void makeVoice(String voice, int number){
        for (int i = 0; i <number ; i++) {
            System.out.println(voice);

        }
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }


}
