#!/usr/bin/env groovy

@Library('demo') 
import org.foo.Bar


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
                def z = new Bar(1,2)
                z.getVars()
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
