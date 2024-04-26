public class StudentRank {

    private String[] students;                              // non-static bc initialized per object
    private int[] ranks;                                       // this makes them instance variables


    public StudentRank(String[] students, int[] ranks) {
        this.students = students;
        this.ranks = ranks;
    }

    /* I have two arrays, name and rank.
     to find the highest rank, I have to iterate through the array
     and compare each element to the previous. Create an int = highestRank
     to hold this value.
     How do I then get the name to be attached to the rank?
     The ranks entered with the same index as their corresponding students
     so when I find the index of highestRank, I can return the students[i] that matches
    */

    public String highestRank() {
        int highestValIndex = 0;
        for (int i = 1; i < ranks.length; i++) {
            if (ranks[i] > ranks[highestValIndex]) {
                highestValIndex = i;
            }

        }
        return students[highestValIndex];
    }

    public String lowestRank() {
        int lowestValIndex = 0;
        for (int i = 1; i < ranks.length; i++) {
            if (ranks[i] < ranks[lowestValIndex]) {
                lowestValIndex = i;
            }

        }
        return students[lowestValIndex];
    }
}


   /*
   - Write a class StudentRank with two member variables:
    1. students -  a string array
    2. ranks - an integer array
   - Add a method named highestRank that returns the highest-ranked student
   - Add a lowestRank method which provides the name of the lowest-ranked student
   - The primary constructor should accept the student and ranks arrays
    */