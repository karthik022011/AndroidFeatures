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
include(":bottomappbar")
include(":datastore")
include(":workmanager")
include(":googlemaps")
include(":darkmode")
include(":notifications")
