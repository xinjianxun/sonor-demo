#!/usr/bin/env groovy
final def releaseTag = (env.TAG_NAME ?: env.BRANCH_NAME).replace("/", "-")
pipeline {
    agent any
    tools {
        maven 'maven3'
    }
    stages {
        stage("maven 编译") {
            steps {
                echo "releaseTag:${releaseTag}"
                echo 'Building..'
                sh 'mvn clean package -Dmaven.test.skip'
            }
        }
    }
}