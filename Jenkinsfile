pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package'
                bat 'docker build . --tag tomcatwebapp:$BUILD_NUMBER'
            }
        }
    }
}
