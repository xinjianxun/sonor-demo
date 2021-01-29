#!/usr/bin/env groovy
final def releaseTag = (env.TAG_NAME ?: env.BRANCH_NAME).replace("/", "-")
pipeline {
    agent any
    stages {
        stage("maven 编译") {
            steps {
                echo "releaseTag:${releaseTag}"
                echo 'Building..'
                bat 'mvn clean package -Dmaven.test.skip'
            }

        }
        stage('代码扫描') {
            steps {
                echo 'scan static code'
                echo  "WORKSPACE:${WORKSPACE}"

            }
        }
    }
}