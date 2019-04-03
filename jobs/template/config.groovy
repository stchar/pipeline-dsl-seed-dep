def PROJECT_ROOT = "jobs/template"
try {
  PROJECT_ROOT = "${gradle_project_dir}/${PROJECT_ROOT}"
} catch(e){
  PROJECT_ROOT = "jobs/template"
}

template_job = [
  name:"template",
  dsl:(String) "$PROJECT_ROOT/dsl/template.groovy",
  pipeline:[(String) "$PROJECT_ROOT/pipeline/template.groovy",(String) "$PROJECT_ROOT/pipeline/template.groovy"]
]

return [
  name:"template",
  jobs:[template_job],
  test_suites: [
    (String) "$PROJECT_ROOT/test/template_SUITE.groovy",
  ],
  siteFilter:{return true}
]
