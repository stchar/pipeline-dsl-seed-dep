def PROJECT_ROOT = "jobs/template"
try {
  PROJECT_ROOT = "${gradle_project_dir}/${PROJECT_ROOT}"
} catch(e){
  PROJECT_ROOT = "jobs/template"
}

template_job = [
  name:"template",
  dsl:  "$PROJECT_ROOT/dsl/template.groovy",
  pipeline:["$PROJECT_ROOT/pipeline/template.groovy","$PROJECT_ROOT/pipeline/template.groovy"]
]

return [
  name:"template",
  jobs:[template_job],
  test_suites: [
    "$PROJECT_ROOT/test/template_SUITE.groovy",
  ],
  siteFilter:{return true}
]
