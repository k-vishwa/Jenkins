#!/usr/bin/env groovy

@Library('demo') _
// import org.*


pipeline {
    agent none
    stages {
        /* "Build" and "Test" stages omitted */

        stage('Deploy - Staging') {
            steps {
                /* sh '''
                    echo "Deploying"
                    echo "Testing"
                    echo $singlyQuoted $doublyQuoted
                 '''*/
                script {
                    sayHello 'Joe'
                    sayHello() /* invoke with default arguments */
                /*    log.warning 'Nothing to do!' */
                }
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
