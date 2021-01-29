#!/usr/bin/env groovy
final def releaseTag = (env.TAG_NAME ?: env.BRANCH_NAME).replace("/", "-")
final def projectName = currentBuild.projectName
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
                echo  "projectName:${currentBuild.projectName}"
                echo  "fullProjectName:${currentBuild.fullProjectName}"
                echo  "displayName:${currentBuild.displayName}"
                echo  "fullDisplayName:${currentBuild.fullDisplayName}"

            }
        }
    }
}