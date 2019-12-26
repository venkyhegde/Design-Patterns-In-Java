package edu.uncc.iterator.university;

public class Client {
    public static void main(String[] args) {
        Subject artsSubs = new ArtsSubject();
        Subject scSubs = new ScienceSubject();

        Iterator scItr = scSubs.createIterator();
        Iterator artsItr = artsSubs.createIterator();

        System.out.println("Iterating science subjects");
        while (!scItr.isDone()){
            System.out.println(scItr.next());
        }

        System.out.println("-------------------------------");

        System.out.println("Iterating Arts subjects");
        while (!artsItr.isDone()){
            System.out.println(artsItr.next());
        }
    }
}
