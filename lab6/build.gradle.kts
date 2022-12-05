plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation ("org.seleniumhq.selenium:selenium-java:3.141.59")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}