apply(plugin = "java")
apply(plugin = "application")

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

configure<ApplicationPluginConvention> {
    mainClassName = "Main"
}

dependencies {
    val testImplementation by configurations
    testImplementation("junit:junit:4.12")
}
