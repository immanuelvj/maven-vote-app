# maven-vote-app

This is a simple maven application which takes in input name and age of a user 
It outputs if the user is eligible to vote 

the pom.xml dependencies list :
common-lang-3
junit

steps to build the project 
1.clone the repository
2.cd maven-vote-app
3.mvn clean - this is to clean the artifacts or temp files created by the previous build process
4.mvn package - compile and package the maven project
5.java -cp target/filename.jar com.example.App 

enter your name and age , the output will be displayed
