dir /b /s *.java > sourcefiles.txt
javac -cp .;..\junit-4.12.jar;..\hamcrest-core-1.3.jar @sourcefiles.txt
java -cp .;..\junit-4.12.jar;..\hamcrest-core-1.3.jar org.junit.runner.JUnitCore BookTest
