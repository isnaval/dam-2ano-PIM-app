pluginManagement {
    repositories {
        // Repositorios para plugins de Google, Android, y Maven
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    // Modo de resolución de dependencias
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// Nombre del proyecto y módulos incluidos
rootProject.name = "SGE-Inventario"
include(":app")