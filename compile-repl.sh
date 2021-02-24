#!/bin/sh

find . -name "*.java" | tr '\n' ' ' | xargs javac -cp .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar
