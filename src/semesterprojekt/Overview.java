/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

/**
 *
 * @author Squid
 */
public class Overview 
{
    public static void makeAnimals()
    {
        Aquatic Goldfish = new Aquatic (1, 3, 50, "Goldfish", 10, true, false, 50, true, 5);
        Aquatic Whale = new Aquatic (5, 30, 500000, "Whale", 500, true, true, 50000000, true, 99999);
        Aquatic Shark = new Aquatic (3, 30, 999999, "Shark", 5000, false, true, 500000, true, 9999);
        Aquatic Seacucumber = new Aquatic (1, 3, 50, "Sea Cucumber", 10, true, false, 50, true, 5);
        Aquatic Dolphin = new Aquatic (3, 30, 999999, "Dolphin", 5000, false, true, 500000, false, 9999);

        Bird dove = new Bird (1, 5, 100, "Dove", 50, true, true, 500, false, 500);
        Bird Pigeon = new Bird (1, 5, 100, "Pigeon", 50, true, true, 500, false, 500);
        Bird smallBird = new Bird (1, 5, 100, "small", 50, true, true, 500, false, 500);
        Bird bigBird = new Bird (1, 10, 200, "large", 100, false, true, 50000, true, 1000);

        Reptile snake = new Reptile (2, 50, 500, "Snake", 100, false, true, 500, true, 500);
        Reptile turtle = new Reptile (7, 75, 1000, "Turtle", 75, true, true, 500, true, 100);
        Reptile salamander = new Reptile (2, 30, 500, "Salamander", 50, false, true, 500, true, 200);
        Reptile dinosaur = new Reptile (5000000, -4900100, 999999, "Dinosaur", 5000, false, true, 999999, true, 99999);
        Reptile dragon = new Reptile (3000, 10000, 999999, "Dragon", 999999, false, true, 9999999, true, 99999);

        Mammal ape = new Mammal (2, 13, 50, "Ape", 50, true, true, 5, false, 50, "Likes to climb");
        Mammal elephant = new Mammal (2, 23, 500, "Elephant", 500, true, false, 50, false, 999, "Eating");
        Mammal horse = new Mammal (2, 13, 320, "horse", 400, false, false, 15, false, 100, "running on the fields");
        Mammal dog = new Mammal (2, 13, 50, "Dog", 50, false, true, 5, false, 30, "Playing fetch");
        Mammal tiger = new Mammal (2, 20, 1000, "Tiger", 200, false, true, 20, false, 99, "sleeping");
    }
}    