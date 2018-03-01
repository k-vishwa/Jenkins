#!/usr/bin/env groovy

pipeline {
    agent any
    stages {
        /* "Build" and "Test" stages omitted */

        stage('Deploy - Staging') {
            steps {
                sh '''
                    echo "Deploying"
                    echo "Testing"
                '''
            }
        }

        stage('Sanity check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }

        stage('Deploy - Production') {
            steps {
                sh 'echo "Running Prod"'
            }
        }
    }
}
