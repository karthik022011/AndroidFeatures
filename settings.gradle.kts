pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidFeatures"
include(":app")
include(":datepicker")
include(":bottomnavigationview")
include(":formfillup")
include(":pagination")
include(":search")
include(":dialogs")
