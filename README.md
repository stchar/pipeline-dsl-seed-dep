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
│
├── plugins.yaml                # list of plugins needed by jeninsfile-runner
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

#### Jenkinsfile-runner
install https://gist.github.com/stchar/b565b0270da156da92ccc4ca44c8cf7b
to  ~/bin/ or any other location in PATH
```
# this is just an example of installation procedure
mkdir -p ~/bin
pushd ~/bin
curl -o jfr-wrapper https://gist.githubusercontent.com/stchar/b565b0270da156da92ccc4ca44c8cf7b/raw/dc1ff16d3040d2dbb67a8b92970ce4859a6223f1/jfr-wrapper
chmod +x jfr-wrapper
popd
```

```
# run jenkinsifile-runner
jfr-wrapper
```

## Deployment
Wrap `jobs/Jenkinsfile.groovy` as jenkins pipeline project and run it
or register this repository as multibranch pipeline scm source



#### Additional Links
* https://jenkinsci.github.io/job-dsl-plugin/
* https://github.com/stchar/pipeline-dsl-seed
* https://github.com/lesfurets/JenkinsPipelineUnit
* https://github.com/mkobit/jenkins-pipeline-shared-libraries-gradle-plugin
* https://github.com/jenkinsci/plugin-installation-manager-tool
* https://github.com/jenkinsci/jenkinsfile-runner
