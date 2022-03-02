import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.6.0-RC2"
    kotlin("plugin.serialization") version "1.5.31"
    `maven-publish`
    `java-library`
    signing
}

group = "it-lab.project.project-site"
version = "1.0.0-dev1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0")

    // https://mvnrepository.com/artifact/org.jetbrains.exposed/exposed-core
    implementation("org.jetbrains.exposed:exposed-core:0.36.1")
    // https://mvnrepository.com/artifact/org.jetbrains.exposed/exposed-jdbc
    implementation("org.jetbrains.exposed:exposed-jdbc:0.36.1")
    // https://mvnrepository.com/artifact/org.jetbrains.exposed/exposed-dao
    implementation("org.jetbrains.exposed:exposed-dao:0.36.1")

    // https://mvnrepository.com/artifact/mysql/mysql-connector-java
    implementation("mysql:mysql-connector-java:8.0.27")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "it-lab.project.project-site"
            artifactId = "database"
            version = "1.0.0-dev2"

            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url  = uri("https://maven.pkg.github.com/IzzzGoy/Project-Site-Database")
            credentials {
                username = "IzzzGoy"
                password = "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"
            }
        }
    }
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}