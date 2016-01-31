#!/bin/zsh
java -Xss1m -cp .:build:/Users/lglo/frege/fregec.jar:jackson-core-2.5.3.jar:jackson-annotations-2.5.0.jar:jackson-databind-2.5.3.jar:jackson-parse-wrapper.jar frege.compiler.Main -d build call_java.fr
