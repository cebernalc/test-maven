pipeline {
    agent any
    tools { 
        maven 'M3'
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    echo "M3_HOME = ${M3_HOME}"
                '''
            }
        }
    }
}