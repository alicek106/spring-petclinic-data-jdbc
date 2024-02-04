/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
    id("org.springframework.boot") version "3.0.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"

}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.spring.io/snapshot")
    }

    maven {
        url = uri("https://repo.spring.io/milestone")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api(libs.org.springframework.boot.spring.boot.starter.actuator)
    api(libs.org.springframework.boot.spring.boot.starter.validation)
    api(libs.org.springframework.boot.spring.boot.starter.cache)
    api(libs.org.springframework.boot.spring.boot.starter.data.jdbc)
    api(libs.org.springframework.boot.spring.boot.starter.web)
    api(libs.org.springframework.boot.spring.boot.starter.thymeleaf)
    api(libs.org.flywaydb.flyway.core)
    api(libs.org.flywaydb.flyway.mysql)
    api(libs.com.github.ben.manes.caffeine.caffeine)
    api(libs.org.webjars.jquery)
    api(libs.org.webjars.jquery.ui)
    api(libs.org.webjars.bootstrap)
    api(libs.org.springframework.boot.spring.boot.devtools)
    runtimeOnly(libs.com.mysql.mysql.connector.j)
    testImplementation(libs.org.springframework.boot.spring.boot.starter.test)
    testImplementation(libs.org.testcontainers.mysql)
}

group = "org.springframework.samples"
version = "3.0.0.BUILD-SNAPSHOT"
description = "petclinic"
java.sourceCompatibility = JavaVersion.VERSION_20

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
