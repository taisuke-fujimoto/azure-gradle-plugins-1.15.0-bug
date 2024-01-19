plugins {
    kotlin("jvm") version "1.9.22"
    id("com.microsoft.azure.azurefunctions") version "1.15.0"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation("com.microsoft.azure.functions:azure-functions-java-library:3.1.0")
}

version = "1"

azurefunctions {
    appName = project.name
}
