pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package'
                echo 'build id : ${env.BUILD_ID}'
                bat 'docker build . --tag tomcatwebapp:"${env.BUILD_NUMBER}"'
            }
        }
    }
}
