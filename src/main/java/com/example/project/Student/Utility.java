package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

  public static ArrayList<Student> sortStudents(ArrayList<Student> studentToSort) {
    ArrayList<Student> sorted = new ArrayList<Student>();
    sorted.add(studentToSort.get(0));
    for(int i = 1; i < studentToSort.size(); i ++) {
      boolean studentAdded = false;
      for(int j = 0; j < sorted.size(); j ++) {
        if(studentToSort.get(i).getLastName().compareTo(sorted.get(j).getLastName()) < 0) {
          sorted.add(j,studentToSort.get(i));
          studentAdded = true;
          break;
        }
        else if(studentToSort.get(i).getLastName().compareTo(sorted.get(j).getLastName()) == 0) {
          if(studentToSort.get(i).getFirstName().compareTo(sorted.get(j).getFirstName()) < 0) {
            sorted.add(j,studentToSort.get(i));
            studentAdded = true;
            break;
          }
          else if((studentToSort.get(i).getFirstName().compareTo(sorted.get(j).getFirstName()) > 0)) {    
            sorted.add(j + 1,studentToSort.get(i));
            studentAdded = true;
            break;
          }
          else {
            if(studentToSort.get(i).getGpa() > sorted.get(j).getGpa()) {
              sorted.add(j,studentToSort.get(i));
              studentAdded = true;
              break;
            }
            else {
              sorted.add(j + 1,studentToSort.get(i));
              studentAdded = true;
              break;
            }
          }
        }
      }
    
      if(!studentAdded) {
        sorted.add(studentToSort.get(i));
      }
    }
    return sorted;
  }
  
  
  
}      
  