package homework.day6;

import homework.day5.playground.essence.craft.air.Aircraft;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.field.Vehicle;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.craft.hand.Mug;
import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Water;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT.genericMethodOneGenArg("Test");
        System.out.println(genericMethodsInGenericClassT.genericMethodTwoGenArgs("Test", 400));
        genericMethodsInGenericClassT.genericMethodHalfGenArgs("Hello ", "World!");
        System.out.println();

        GenericMethodsInGenericClassT<Integer> genericMethodsInGenericClassT1 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT1.genericMethodOneGenArg(700);
        System.out.println(genericMethodsInGenericClassT1.genericMethodTwoGenArgs(380, "Hello!"));
        genericMethodsInGenericClassT1.genericMethodHalfGenArgs(150, "Hello!");
        System.out.println();

        GenericMethodsInGenericClassT<Double> genericMethodsInGenericClassT2 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT2.genericMethodOneGenArg(0.55);
        System.out.println(genericMethodsInGenericClassT2.genericMethodTwoGenArgs(0.09, "This is double."));
        genericMethodsInGenericClassT2.genericMethodHalfGenArgs(0.09, "String parameter");
        System.out.println();

        GenericMethodsInGenericClassT<Fly> genericMethodsInGenericClassT3 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT3.genericMethodOneGenArg(new Fly(12, "Tosya"));
        System.out.println(genericMethodsInGenericClassT3.genericMethodTwoGenArgs(new Fly(12, "Tania"), new Mosquito(8, "Tom")));
        genericMethodsInGenericClassT3.genericMethodHalfGenArgs(new Fly(11, "Tani"), "This is a string for the third method.");
        System.out.println();

        GenericMethodsInGenericClassT<Aircraft> genericMethodsInGenericClassT4 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT4.genericMethodOneGenArg(new Copter(212, "Copter 1"));
        System.out.println(genericMethodsInGenericClassT4.genericMethodTwoGenArgs(new Plane(790, "Plane as aircraft"), 900));
        genericMethodsInGenericClassT4.genericMethodHalfGenArgs(new Rocket(1800, "Rocket as aircraft"), "Pif-paf");
        System.out.println();

        GenericMethodsInGenericClassT<Copter> genericMethodsInGenericClassT5 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT5.genericMethodOneGenArg(new Copter(212, "Copter 2"));
        System.out.println(genericMethodsInGenericClassT5.genericMethodTwoGenArgs(new Copter(212, "Copter method two"), "Test"));
        genericMethodsInGenericClassT5.genericMethodHalfGenArgs(new Copter(212, "Copter method three"), "String method three");
        System.out.println();

        GenericMethodsInGenericClassT<Plane> genericMethodsInGenericClassT6 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT6.genericMethodOneGenArg(new Plane(412, "Plane item"));
        System.out.println(genericMethodsInGenericClassT6.genericMethodTwoGenArgs(new Plane(222, "Plane method two"), new Fly(12, "Small fly")));
        genericMethodsInGenericClassT6.genericMethodHalfGenArgs(new Plane(232, "Plane method three"), "Three");
        System.out.println();

        GenericMethodsInGenericClassT<Rocket> genericMethodsInGenericClassT7 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT7.genericMethodOneGenArg(new Rocket(812, "Rocket Star"));
        System.out.println(genericMethodsInGenericClassT7.genericMethodTwoGenArgs(new Rocket(812, "Rocket Star2"), 900));
        genericMethodsInGenericClassT7.genericMethodHalfGenArgs(new Rocket(812, "Rocket Star3"), "Hello");
        System.out.println();

        GenericMethodsInGenericClassT<Vehicle> genericMethodsInGenericClassT8 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT8.genericMethodOneGenArg(new Car(88, "Car one"));
        System.out.println(genericMethodsInGenericClassT8.genericMethodTwoGenArgs(new Car(88, "Car method two"), 120));
        genericMethodsInGenericClassT8.genericMethodHalfGenArgs(new Car(88, "Car method three"), "Car method three.");
        System.out.println();

        GenericMethodsInGenericClassT<Car> genericMethodsInGenericClassT9 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT9.genericMethodOneGenArg(new Car(80, "Car two"));
        System.out.println(genericMethodsInGenericClassT9.genericMethodTwoGenArgs(new Car(80, "Car two method two"), new Plane(980, "Plane for car.")));
        genericMethodsInGenericClassT9.genericMethodHalfGenArgs(new Car(80, "Car two method three"), "This is method three");
        System.out.println();

        GenericMethodsInGenericClassT<Moped> genericMethodsInGenericClassT10 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT10.genericMethodOneGenArg(new Moped(12, "Moped item"));
        System.out.println(genericMethodsInGenericClassT10.genericMethodTwoGenArgs(new Moped(12, "Moped item2"), 190));
        genericMethodsInGenericClassT10.genericMethodHalfGenArgs(new Moped(12, "Moped item3"), "Moped string");
        System.out.println();

        GenericMethodsInGenericClassT<Motorbike> genericMethodsInGenericClassT11 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT11.genericMethodOneGenArg(new Motorbike(22, "Motorbike item"));
        System.out.println(genericMethodsInGenericClassT11.genericMethodTwoGenArgs(new Motorbike(22, "Motorbike item2"), "Hello-hello"));
        genericMethodsInGenericClassT11.genericMethodHalfGenArgs(new Motorbike(22, "Motorbike item3"), "Motorbike string");
        System.out.println();

        GenericMethodsInGenericClassT<Container> genericMethodsInGenericClassT12 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT12.genericMethodOneGenArg(new Container(2, "Some Container") {
            @Override
            public void setMass(int mass) {
                super.setMass(mass);
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            }
        });
        System.out.println(genericMethodsInGenericClassT12.genericMethodTwoGenArgs(new Can(1, "Can for container"), new Mug(1, "Mug for container")));
        genericMethodsInGenericClassT12.genericMethodHalfGenArgs(new Can(1, "Can for method three"), "Can for method three");
        System.out.println();

        GenericMethodsInGenericClassT<Bottle> genericMethodsInGenericClassT13 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT13.genericMethodOneGenArg(new Bottle(1, "Bottle item"));
        System.out.println(genericMethodsInGenericClassT13.genericMethodTwoGenArgs(new Bottle(1, "Bottle item2"), "Ho-ho-ho"));
        genericMethodsInGenericClassT13.genericMethodHalfGenArgs(new Bottle(1, "Bottle item3"), "Test bottle for method three");
        System.out.println();

        GenericMethodsInGenericClassT<Can> genericMethodsInGenericClassT14 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT14.genericMethodOneGenArg(new Can(1, "Can item"));
        System.out.println(genericMethodsInGenericClassT14.genericMethodTwoGenArgs(new Can(1, "Can item2"), 1.0));
        genericMethodsInGenericClassT14.genericMethodHalfGenArgs(new Can(1, "Can item3"), "Can for method three");
        System.out.println();

        GenericMethodsInGenericClassT<Mug> genericMethodsInGenericClassT15 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT15.genericMethodOneGenArg(new Mug(2, "Mug item"));
        System.out.println(genericMethodsInGenericClassT15.genericMethodTwoGenArgs(new Mug(2, "Mug item lalala"), new Mug(2, "Mug item hoho")));
        genericMethodsInGenericClassT15.genericMethodHalfGenArgs(new Mug(2, "Mug item3"), "Method three for mug");
        System.out.println();

        GenericMethodsInGenericClassT<Animal> genericMethodsInGenericClassT16 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT16.genericMethodOneGenArg(new Crocodile(100, "Crocodile one"));
        System.out.println(genericMethodsInGenericClassT16.genericMethodTwoGenArgs(new Crocodile(100, "Crocodile two-to-to"), true));
        genericMethodsInGenericClassT16.genericMethodHalfGenArgs(new Crocodile(100, "Crocodile three"), "Hi!");
        System.out.println();

        GenericMethodsInGenericClassT<Beetle> genericMethodsInGenericClassT17 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT17.genericMethodOneGenArg(new Beetle(1, "Beetle item"));
        System.out.println(genericMethodsInGenericClassT17.genericMethodTwoGenArgs(new Beetle(1, "Beetle item2"), false));
        genericMethodsInGenericClassT17.genericMethodHalfGenArgs(new Beetle(1, "Beetle item3"), "Hi, beetle!");
        System.out.println();

        GenericMethodsInGenericClassT<Carrot> genericMethodsInGenericClassT18 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT18.genericMethodOneGenArg(new Carrot(2, "Carrot item"));
        System.out.println(genericMethodsInGenericClassT18.genericMethodTwoGenArgs(new Carrot(2, "Carrot item"), "Ping-pong"));
        genericMethodsInGenericClassT18.genericMethodHalfGenArgs(new Carrot(2, "Carrot item"), "Carrot");
        System.out.println();

        GenericMethodsInGenericClassT<Chamomile> genericMethodsInGenericClassT19 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT19.genericMethodOneGenArg(new Chamomile(1, "Chamomile item"));
        System.out.println(genericMethodsInGenericClassT19.genericMethodTwoGenArgs(new Chamomile(1, "Chamomile item2"), 1290));
        genericMethodsInGenericClassT19.genericMethodHalfGenArgs(new Chamomile(1, "Chamomile item3"), "This is a chamomile");
        System.out.println();

        GenericMethodsInGenericClassT<Crocodile> genericMethodsInGenericClassT20 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT20.genericMethodOneGenArg(new Crocodile(102, "Crocodile 2"));
        System.out.println(genericMethodsInGenericClassT20.genericMethodTwoGenArgs(new Crocodile(102, "Crocodile 2"), 'C'));
        genericMethodsInGenericClassT20.genericMethodHalfGenArgs(new Crocodile(102, "Crocodile 3"), "Cocodrilo");
        System.out.println();

        GenericMethodsInGenericClassT<Flower> genericMethodsInGenericClassT21 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT21.genericMethodOneGenArg(new Maylily(1, "Maylily one"));
        System.out.println(genericMethodsInGenericClassT21.genericMethodTwoGenArgs(new Maylily(1, "Maylily two"), new Fly(12, "Test fly")));
        genericMethodsInGenericClassT21.genericMethodHalfGenArgs(new Maylily(1, "Maylily three"), "One, two, three");
        System.out.println();

        GenericMethodsInGenericClassT<Insect> genericMethodsInGenericClassT22 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT22.genericMethodOneGenArg(new Fly(1, "Fly as insect"));
        System.out.println(genericMethodsInGenericClassT22.genericMethodTwoGenArgs(new Fly(1, "Fly as insect2"), "Hey-ho"));
        genericMethodsInGenericClassT22.genericMethodHalfGenArgs(new Fly(1, "Fly as insect3"), "Insect");
        System.out.println();

        GenericMethodsInGenericClassT<Maylily> genericMethodsInGenericClassT23 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT23.genericMethodOneGenArg(new Maylily(1, "Maylily two"));
        System.out.println(genericMethodsInGenericClassT23.genericMethodTwoGenArgs(new Maylily(1, "Maylily two-two-two"), 0));
        genericMethodsInGenericClassT23.genericMethodHalfGenArgs(new Maylily(1, "Maylily three"), "Method three");
        System.out.println();

        GenericMethodsInGenericClassT<Mosquito> genericMethodsInGenericClassT24 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT24.genericMethodOneGenArg(new Mosquito(1, "Mosquito item"));
        System.out.println(genericMethodsInGenericClassT24.genericMethodTwoGenArgs(new Mosquito(1, "Mosquito item"), "Privet"));
        genericMethodsInGenericClassT24.genericMethodHalfGenArgs(new Mosquito(1, "Mosquito item"), "Check");
        System.out.println();

        GenericMethodsInGenericClassT<Pigeon> genericMethodsInGenericClassT25 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT25.genericMethodOneGenArg(new Pigeon(25, "Pigeon item"));
        System.out.println(genericMethodsInGenericClassT25.genericMethodTwoGenArgs(new Pigeon(25, "Pigeon item"), new Pigeon(25, "Pigeon item")));
        genericMethodsInGenericClassT25.genericMethodHalfGenArgs(new Pigeon(25, "Pigeon item"), "Some pigeon object");
        System.out.println();

        GenericMethodsInGenericClassT<Plant> genericMethodsInGenericClassT26 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT26.genericMethodOneGenArg(new Rose(1, "Rose one"));
        System.out.println(genericMethodsInGenericClassT26.genericMethodTwoGenArgs(new Rose(1, "Rose one"), 1290));
        genericMethodsInGenericClassT26.genericMethodHalfGenArgs(new Rose(1, "Rose one"), "Test string");
        System.out.println();

        GenericMethodsInGenericClassT<Potato> genericMethodsInGenericClassT27 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT27.genericMethodOneGenArg(new Potato(1, "Potato item"));
        System.out.println(genericMethodsInGenericClassT27.genericMethodTwoGenArgs(new Potato(1, "Potato item"), 0.5));
        genericMethodsInGenericClassT27.genericMethodHalfGenArgs(new Potato(1, "Potato item"), "mimimi");
        System.out.println();

        GenericMethodsInGenericClassT<Radish> genericMethodsInGenericClassT28 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT28.genericMethodOneGenArg(new Radish(1, "Radish item"));
        System.out.println(genericMethodsInGenericClassT28.genericMethodTwoGenArgs(new Radish(1, "Radish item"), new Car(320, "Car test")));
        genericMethodsInGenericClassT28.genericMethodHalfGenArgs(new Radish(1, "Radish item"), "Radish string");
        System.out.println();

        GenericMethodsInGenericClassT<Raven> genericMethodsInGenericClassT29 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT29.genericMethodOneGenArg(new Raven(2, "Raven item"));
        System.out.println(genericMethodsInGenericClassT29.genericMethodTwoGenArgs(new Raven(2, "Raven item"), "Hey, my friend"));
        genericMethodsInGenericClassT29.genericMethodHalfGenArgs(new Raven(2, "Raven item"), "Hey, my friend!");
        System.out.println();

        GenericMethodsInGenericClassT<Rose> genericMethodsInGenericClassT30 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT30.genericMethodOneGenArg(new Rose(1, "Rose two"));
        System.out.println(genericMethodsInGenericClassT30.genericMethodTwoGenArgs(new Rose(1, "Rose two"), 3290));
        genericMethodsInGenericClassT30.genericMethodHalfGenArgs(new Rose(1, "Rose two"), "This is a rose for you");
        System.out.println();

        GenericMethodsInGenericClassT<Vegetalbe> genericMethodsInGenericClassT31 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT31.genericMethodOneGenArg(new Potato(1, "Potato as vegetable"));
        System.out.println(genericMethodsInGenericClassT31.genericMethodTwoGenArgs(new Potato(1, "Potato as vegetable"), true));
        genericMethodsInGenericClassT31.genericMethodHalfGenArgs(new Potato(1, "Potato as vegetable"), "Test");
        System.out.println();

        GenericMethodsInGenericClassT<Diesel> genericMethodsInGenericClassT32 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT32.genericMethodOneGenArg(new Diesel());
        System.out.println(genericMethodsInGenericClassT32.genericMethodTwoGenArgs(new Diesel(), "Test diesel"));
        genericMethodsInGenericClassT32.genericMethodHalfGenArgs(new Diesel(), "This is a test string for method three");
        System.out.println();

        GenericMethodsInGenericClassT<Petrol> genericMethodsInGenericClassT33 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT33.genericMethodOneGenArg(new Petrol());
        System.out.println(genericMethodsInGenericClassT33.genericMethodTwoGenArgs(new Petrol(), 0.2));
        genericMethodsInGenericClassT33.genericMethodHalfGenArgs(new Petrol(), "Petrol");
        System.out.println();

        GenericMethodsInGenericClassT<Water> genericMethodsInGenericClassT34 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT34.genericMethodOneGenArg(new Water());
        System.out.println(genericMethodsInGenericClassT34.genericMethodTwoGenArgs(new Water(), new Copter(222, "Copter-topter")));
        genericMethodsInGenericClassT34.genericMethodHalfGenArgs(new Water(), "Some water for you");
        System.out.println();

        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassT35 = new GenericMethodsInGenericClassT<>();
        System.out.println(genericMethodsInGenericClassT35.genericMethodTwoGenArgs("Hello!", 800));
        System.out.println();

        GenericMethodsInGenericClassT<Fly> genericMethodsInGenericClassT36 = new GenericMethodsInGenericClassT<>();
        System.out.println(genericMethodsInGenericClassT36.genericMethodTwoGenArgs(new Fly(10, "Milly"), "I am small"));
        System.out.println();

        GenericMethodsInGenericClassT<Fly> genericMethodsInGenericClassT37 = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT37.genericMethodHalfGenArgs(new Fly(10, "Bob"), "This is a test string");
        System.out.println();

    }
}
