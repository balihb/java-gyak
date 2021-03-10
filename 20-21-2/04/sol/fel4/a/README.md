

~~~
// Create JAR file containing mass/Main.class mass/util/Point.class
jar -cf mass-deploy.jar mass/Main.class mass/util/Point.class

// Run JAR file with launching main class
java -classpath mass-deploy.jar mass.Main

// Extract JAR file (just to check its content)
jar -xf mass-deploy.jar
~~~


