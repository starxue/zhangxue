#!/bin/bash
# http://stackoverflow.com/questions/9846046/run-main-class-of-maven-project
ARGS="$@"
mvn exec:java -Dexec.mainClass="com.zzzhc.base.code.Generator" -Dexec.args="$ARGS"
