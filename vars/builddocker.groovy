#!/usr/bin/env groovy

def call() {
    echo "Building docker image"
    sh 'docker build -t omarsala78/my-rep:myjvp1.0 .'
}
