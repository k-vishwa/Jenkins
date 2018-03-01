#!/usr/bin/env groovy

@Library('demo') _
 import org.foo.Bar


pipeline {
    agent any
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
                   /* sayHello 'Joe'
                    sayHello() /* invoke with default arguments */
                /*    log.warning 'Nothing to do!' */
                new Bar(1,2).getVars()
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
