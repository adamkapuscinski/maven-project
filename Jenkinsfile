pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean package'
                //bat 'mvn clean package'
                //bat "docker build . --tag tomcatwebapp:${env.BUILD_ID}"
            }
        }
    }
}
