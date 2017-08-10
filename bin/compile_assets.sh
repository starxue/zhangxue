#!/bin/bash
ARGS="$@"
mvn exec:java -Dexec.mainClass="com.zzzhc.base.web.taglib.AssetPrecompiler" -Dexec.args="$ARGS"
