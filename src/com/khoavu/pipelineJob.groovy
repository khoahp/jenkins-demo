pipeline {
    agent any
    stages {
        stage('Build') {
            node {
                def config = load 'ConfigHelper.groovy';
                echo config.showData()
            }

            steps {
                echo 'Build'
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}


