# Jenkins Pipeline Template Project
This repository contains template of scripted Pipeline to act as depended project of https://github.com/stchar/pipeline-dsl-seed-dep

## Repository Structure
```
.
├── jobs
│   │
│   └─── template                   # A sample project of your jenkins job
│       │
│       ├── config.groovy           # Project config file
│       │                           # (contains list of jobs
│       │                           # and other settings needed by `pipeline-dsl-seed` project)
│       │
│       ├── dsl
│       │   └── template.groovy       # job settings
│       │
│       ├── pipeline
│       │   └── template.groovy       # pipeline script
│       └── test
│           └── template_SUITE.groovy # example of e2e test
└── src
    └── test
        └── groovy
            └── TestTemplateJob.groovy # Some examples of unit tests
                                       # created using `JenkinsPipelineUnit`
```

## Contribution

###  Testing
```
./gradlew test
```
## Deployment
Wrap `jobs/Jenkinsfile.groovy` as jenkins pipeline project and run it
or register this repository as multibranch pipeline scm source


#### Additional Links
* https://jenkinsci.github.io/job-dsl-plugin/
* https://github.com/stchar/pipeline-dsl-seed
* https://github.com/lesfurets/JenkinsPipelineUnit
* https://github.com/mkobit/jenkins-pipeline-shared-libraries-gradle-plugin
