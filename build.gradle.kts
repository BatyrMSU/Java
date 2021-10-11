plugins {
    id("java")
    kotlin("jvm") version "1.4.31"
    `kotlin-dsl`
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("com.intellij:annotations:12.0")


}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}