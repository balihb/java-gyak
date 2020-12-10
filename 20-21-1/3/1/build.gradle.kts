application {
    mainClassName = if (hasProperty("otherpackage")) "otherpackage.Main" else "packagename.Main"
}
