#!/usr/bin/env groovy

def call() {
    echo "Building docker image"
    sh "docker build -t ${params.'Image Name'} ."
    echo "${params.'Image Name'}"
}
