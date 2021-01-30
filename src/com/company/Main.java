package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("varsik", 12, Color.BLACK, new Voice("gav"),"alabai");
        System.out.println(dog.getAge() + " " + dog.getName() + " " +dog.getVoice() + " " + dog.getBreed() + "" + dog.getColor());


        Pitbul pitbul = new Pitbul("varsik", 23, 50, "boicovaya sobaka",Color.GRAY,new Voice("gav"),"pitbul");
        System.out.println(pitbul.getType() + " " + pitbul.getWeight() + " " + pitbul.getName() + " " + pitbul.getAge() + " " + pitbul.getBreed());


    }


}
