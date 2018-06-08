pipeline {
    agent any
    tools { 
        maven 'M3'
    }
    stages {
        stage('Build') {
            steps {
                sh '/Users/cbernalc/Applications/apache-maven/bin/mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh '/Users/cbernalc/Applications/apache-maven/bin/mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}