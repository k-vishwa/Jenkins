#!/usr/bin/env groovy

pipeline {
    agent any
    def singlyQuoted = 'Hello'
    def doublyQuoted = "World"
    stages {
        /* "Build" and "Test" stages omitted */

        stage('Deploy - Staging') {
            steps {
                sh '''
                    echo "Deploying"
                    echo "Testing"
                    echo $singlyQuoted $doublyQuoted
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
