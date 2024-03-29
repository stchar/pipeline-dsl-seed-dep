def seed_url = "https://github.com/stchar/pipeline-dsl-seed"


pipeline {
    options {
        skipDefaultCheckout()
    }
    parameters {
        string name:"seed_ref", defaultValue: "master"
    }
    agent any
    stages {
        stage('prebuild') {
            steps {
                dir('pipeline-dsl-seed-dep') {
                    checkout scm
                }
                dir('pipeline-dsl-seed'){
                    git(url:seed_url, branch: params.seed_ref)
                }
            }
        }
        stage('configure') {
            steps {
                dir('pipeline-dsl-seed'){
                    sh "./gradlew getJobs"
                }
            }
        }
         stage('test') {
             steps {
                dir('pipeline-dsl-seed'){
                    sh "./gradlew check"
                }
             }
        }
        stage('deploy') {
            //when { branch "master" }
            steps {
                // Call seeder script to deploy jobs in the configuration
                dir('pipeline-dsl-seed'){
                    jobDsl(targets: 'jobs/seeder.groovy',
                        unstableOnDeprecation: true,
                        failOnMissingPlugin: true)
                }
            }
        }
        stage('e2e-tests') {
            steps {
                script {
                    dir('pipeline-dsl-seed'){
                        test_suites = new groovy.json.JsonSlurper().parseText(readFile(".test_suites.json"))
                        echo "test_suites = ${test_suites}"
                        for (suite in test_suites) {
                            echo "suite = $suite"
                            load suite
                        }
                    }
                }
            }
        }
    }
}
