/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task;

/**
 *
 * @author kamoh
 */
public class Task {

   public static boolean checkTaskDescription(String password){
      String wrongTaskDescription = "Please enter a task description of less than 50 characters";
      String correctTaskDescription = "Task succesfully captured";
       while (password.length()<=50){
           return true;
       }
      return false;
    }
   
   public static String createTaskID(String taskName, String taskID, String developerName, String name, int taskNumber){
       taskID = (taskName.substring(0,2) + ":" + taskNumber + developerName.substring(name.length()-3) );
       return taskID.toUpperCase();
   }
   
   public static String printTaskDetails(String taskStatus, String name, String surname, int i, String taskName, String taskDescription, String taskID, int taskDuration){
       return taskStatus + "," + name + "," + surname + "," + i + "," + taskName + taskDescription  + "," + createTaskID(name, taskName, i , taskID)+ "," + taskDuration + "hrs";
   }
   
   public static int returnTotalHours(int i, int taskDuration){
       int total = 0;
       for (int x = 0; x < i; x++){
           total = total + taskDuration;
       }
       return total;
   }
}
