dir /b /s *.java > sourcefiles.txt

javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar @sourcefiles.txt

REM itt a main a JUnitCore ami betölti a tests.Tests teszt osztályt
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore tests.Tests
