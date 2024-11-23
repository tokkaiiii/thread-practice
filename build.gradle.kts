plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.masa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("ch.qos.logback:logback-classic:1.5.12")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}