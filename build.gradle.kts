plugins {
    java
    scala
    application
}

repositories { // Where to search for dependencies
    mavenCentral()
}

dependencies {
    // Suppressions for SpotBugs
    compileOnly("com.github.spotbugs:spotbugs-annotations:4.9.8")

    // Maven dependencies are composed by a group name, a name and a version, separated by colons
    implementation("com.omertron:API-OMDB:1.5")
    implementation("org.jooq:jool:0.9.15")
    implementation("org.slf4j:slf4j-api:2.0.17")
    implementation("org.scala-lang:scala3-library_3:3.7.4")
    runtimeOnly("ch.qos.logback:logback-classic:1.5.32")
}

application {
    mainClass.set("Main")
}