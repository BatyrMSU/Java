plugins {
    java
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
    implementation(project(":models"))
    implementation("com.google.code.gson:gson:2.8.8")

}

application {
    mainClass.set("library.controller.App")
}


tasks.register<JavaExec>("startMainClass") {

    group = "launch"
    mainClass.set("mypackage2.App")
    classpath = sourceSets["main"].runtimeClasspath

}



tasks.getByName<Test>("test") {
    useJUnitPlatform()
}