package org.example;

import org.example.Leaf.BusinessAnalyst;
import org.example.Node.Developer;
import org.example.Node.Leader;
import org.example.Root.Boss;

public class Client {
    public static void main(String[] args) {
        Boss boss = new Boss("RankillerDY", 22, 8000);
        BusinessAnalyst BA = new BusinessAnalyst("James", 22, 2000);

        Leader leader = new Leader("Robert", 22, 4000);
        Developer dev1 = new Developer("Hannie", 22, 2000);
        Developer dev2 = new Developer("Ngan", 22, 6000);

        leader.add(dev1);
        leader.add(dev2);
        boss.add(leader);
        boss.add(BA);

        boss.print();
    }
}