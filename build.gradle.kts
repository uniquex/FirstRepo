plugins {
    java
    id("org.springframework.boot") version "2.7.2"
    id("io.spring.dependency-management") version "1.1.0"
    groovy
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")

    //lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    runtimeOnly("org.postgresql:postgresql")
    implementation("org.liquibase:liquibase-core:4.20.0") {
        exclude("org.yaml:snakeyaml:1.30")
    }


    // https://mvnrepository.com/artifact/org.liquibase/liquibase-core

    // https://mvnrepository.com/artifact/org.yaml/snakeyaml
    implementation("org.yaml:snakeyaml:1.32")

    //validation
    implementation("org.springframework.boot:spring-boot-starter-validation")

    //mapper
    implementation("org.mapstruct:mapstruct-jdk8:1.3.0.Final")
    annotationProcessor("org.mapstruct:mapstruct-jdk8:1.3.0.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.3.0.Final")

    //unit testing
/*
    testImplementation("org.springframework.boot:spring-boot-starter-test")
*/
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation ("org.spockframework:spock-spring:2.3-groovy-4.0")
    testImplementation ("io.github.benas:random-beans:3.9.0")

    //swagger
/*
    implementation("io.springfox:springfox-boot-starter:3.0.0")
*/

    //security
    implementation("org.springframework.boot:spring-boot-starter-security")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
