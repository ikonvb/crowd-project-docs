plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "crowd-project-docs"
includeBuild("crowd-proj-docs-be")
include("lectures")
include("lectures:m1l1-first")
findProject(":lectures:m1l1-first")?.name = "m1l1-first"
