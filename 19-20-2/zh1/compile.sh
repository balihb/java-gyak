#!/bin/sh

find . -name "*.java" | xargs javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore tests.Tests
