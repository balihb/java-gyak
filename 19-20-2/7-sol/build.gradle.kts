subprojects {
    apply(plugin = "java")
    apply(plugin = "application")

    configure<SourceSetContainer> {
        named("main") {
            java.srcDir("${projectDir}/src/main")
        }
        named("test") {
            java.srcDir("${projectDir}/src/test")
        }
    }

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        val testImplementation by configurations
        testImplementation("junit:junit:4.12")
    }
}
