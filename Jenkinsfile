pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build Java Artifact') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Build Docker Image') {
                    steps {
                        sh 'mvn package'
                    }
        }
    }
}