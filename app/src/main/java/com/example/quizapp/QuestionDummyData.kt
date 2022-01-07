package com.example.quizapp

object QuestionDummyData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       val que:ArrayList<QuestionData> = arrayListOf()

       val question1 = QuestionData(
           1,
           "What is the full form of DBMS?",

           "Data of Binary Management System",
           "Database Management System",
           "Database Management Service",
           "Data Backup Management System",
           2
       )
       val question2 = QuestionData(
           2,
           "Operating system is a collection of ?" ,

           "Software routines",
           "Input-output devices",
           "Hardware components",
           "All of these",
           1
       )
       val question3 = QuestionData(
           3,
           "How can we describe an array in the best possible way?",

           "The Array shows a hierarchical structure",
           "Container that stores the elements of similar types",
           "Arrays are immutable",
           "The Array is not a data structure",
           2
       )
       val question4 = QuestionData(
           4,
           "Which type of data can be stored in the database?",

           "Image oriented data",
           "Text, files containing data",
           "Data in the form of audio or video",
           "All of the above",
           4
       )

       val question5 = QuestionData(
           5,
           "How can we initialize an array in C language?",

           "int arr[2]=(10, 20)",
           "int arr(2)={10, 20}",
           "int arr(2) = (10, 20)",
           "int arr[2] = {10, 20}",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)

       return que
   }
}