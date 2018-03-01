#!/usr/bin/env groovy

@Library('demo') _
 import org.foo.*
@Library('demo') _
 import org.foo.*


pipeline {
    agent any
    stages {
        /* "Build" and "Test" stages omitted */

        stage('Deploy - Staging') {
            steps {
                script {
                    ret = new Bar("1").getVars()
                    println ret
                }
            }
        }

       
    }
}
