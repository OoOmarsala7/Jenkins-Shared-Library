#!/usr/bin/env groovy

def call() {
    withCredentials([usernamePassword(credentialsId: 'docker', usernameVariable: 'USER', passwordVariable: 'PWD')]) {
        echo "Logging into docker hub"
        sh "echo ${PWD} | docker login -u ${USER} --password-stdin"
        sh "docker push ${params.'Image Name'}"
    }}


