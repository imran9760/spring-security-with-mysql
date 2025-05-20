pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                  withMaven(maven : 'M2_HOME') {
                    bat 'mvn test'
                }
            }  
         }
        stage ('Build Stage') {
 
            steps {
                withMaven(maven : 'M2_HOME') {
                    bat 'mvn clean install'
                }
            }
     
     }              
       
     }
 
    }