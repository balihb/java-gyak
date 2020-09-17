subprojects {
    apply(plugin = "java")
    apply(plugin = "application")

    configure<SourceSetContainer> {
        named("main") {
            java.srcDir("${projectDir}/src")
        }
    }

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
