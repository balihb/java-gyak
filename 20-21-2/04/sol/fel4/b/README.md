

Manifest file: basic info about jar, important: main class's fully qualified name


~~~
// Create JAR file containing mass/Main.class mass/util/Point.class with manifest file META-INF/MANIFEST.MF
jar cmvf META-INF/MANIFEST.MF mass-deploy.jar mass/Main.class mass/util/Point.class

// Run JAR file
java -jar mass-deploy.jar
~~~


