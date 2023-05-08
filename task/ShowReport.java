/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

/**
 *
 * @author kamoh
 */
public class ShowReport {
    
    //"public static" was used before each array in order to be able to access it throughout the whole class
    public static int[] taskDuration;
    public static String[] developerName;
    public static String[] taskID;
    public static String[] taskStatus;
    public static String[] taskName;
    
    //This method is used to display the developer name, task name and task duration if the task status returns "Done".
    public static String statusofDone(){
        String statusOfDone="";
        for (int i=0;1 < taskStatus.length; i++){
            if (taskStatus[i].equals("Done")){
                statusOfDone += developerName[i] + "" + taskName[i] + "" + taskDuration[i] + "/n";
            }
        }
        return statusOfDone;
    }
    //This method is used to search through the taskDuration array and look for the one with the longest duration
    public static String longestDuration(){
        
        int highest = taskDuration[0];
        for (int i=0; i<taskDuration.length; i++){
            if (highest < taskDuration[i]){
                highest = taskDuration[i];
               
            }
        }
        return "The longest duration is equal to" + highest;
    }
    //This method is used to display the task name, developer name and task status using the task name
    public static String searchTaskName(){
        String displayMethodDetails="";
        for (int i=0; i<taskName.length; i++){
            if(taskName.equals(taskName[i])){
               displayMethodDetails +=taskName[i] + "" + developerName[i] + "" + taskStatus[i];
            }
        }
        return displayMethodDetails;
    }
    //This method is used to display the task name and task status using the developer name
    public static String searchTaskStatus(){
        String displayTaskStatusDetails="";
        for (int i=0; i< developerName.length; i++){
            if (developerName.equals(developerName[i])){
                displayTaskStatusDetails += taskName[i] + "" + taskStatus[i];
            }
        }
        return displayTaskStatusDetails;
    }
    //This method is used to delete a task
    public static void deleteTask(int x){
        //The following below is used to create new arrays with 1 less number of positions
        int[] newTaskDuration = new int [taskDuration.length - 1];
        String[] newDeveloperName = new String [developerName.length - 1];
        String[] newTaskID = new String [taskID.length - 1];
        String[] newTaskStatus = new String [taskStatus.length - 1];
        String[] newTaskName = new String [taskName.length - 1];
        
        int a = 0;
        int b = 0;
        
        for(int i=0; i<taskDuration.length; i++){
            if (taskDuration[i] != x){
                newTaskDuration[a] = taskDuration[i];
                a++;
            }
            else{
                b = i;
            }
        }
        int c = 0;
        //c represents the the position of all the other parallel arrays
        for(int i = 0; i < taskDuration.length; i++){
            if (i != b ){
                newDeveloperName[c] = developerName[i]; 
                newTaskID[c] = taskID[i];
                newTaskStatus[c] = taskStatus[i];
                newTaskName[c] = taskName[i];
                c++;
            }
        }
        taskDuration = newTaskDuration;
        developerName = newDeveloperName;
        taskID = newTaskID;
        taskStatus = newTaskStatus;
        taskName = newTaskName;
    }
   //This metod is used to display the tasks 
    public static String displayReport(){
        for (int i=0; i<developerName.length; i++){
            return (developerName[i] + "" + taskStatus[i] + "" + taskName[i] + "" + taskDuration[i]);
        }
        return null;
    }
}
