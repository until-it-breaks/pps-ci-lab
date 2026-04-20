plugins {
    java
    scala
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Source: https://mvnrepository.com/artifact/org.scala-lang/scala-library
    implementation("org.scala-lang:scala3-library_3:3.7.4")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application {
    mainClass.set("Main")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}