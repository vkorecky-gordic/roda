#!/bin/bash

MAXIMUM_HEAP_SIZE=256m
JAVA_EXEC="$JAVA_HOME/bin/java"

$JAVA_EXEC -Xmx$MAXIMUM_HEAP_SIZE -jar $INSTALL_PATH/roda-in.jar
