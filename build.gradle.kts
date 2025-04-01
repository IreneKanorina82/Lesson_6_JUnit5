plugins {
    id("java")
    id("io.qameta.allure.version.2.27.0")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.1.0")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.1.2")

    testImplementation("org.aspectj:aspectjweaver:1.9.5")
    testImplementation("io.qameta.allure:allure-junit5:5.12.1")
    testImplementation("io.qameta.allure:allure-assertj:5.12.1")
    testImplementation("io.qameta.allure:allure-rest-assured:5.12.1")
    testImplementation("io.qameta.allure:allure-java-commons:5.12.1")
    testImplementation("io.qameta.allure:allure-selenium:5.12.1")
}

tasks.test {
    useJUnitPlatform()
}