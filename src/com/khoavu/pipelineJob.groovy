def config = load 'ConfigHelper.groovy';

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build'

                echo config.showData()

            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}


