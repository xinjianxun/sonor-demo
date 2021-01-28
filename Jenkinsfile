#!/usr/bin/env groovy
final def releaseTag = (env.TAG_NAME ?: env.BRANCH_NAME).replace("/", "-")
pipeline {
    agent any
    stages {
        stage("maven 编译") {
            steps {
                echo "releaseTag:${releaseTag}"
                echo 'Building..'
                bat 'sonar:sonar'
            }
        }
    }
}