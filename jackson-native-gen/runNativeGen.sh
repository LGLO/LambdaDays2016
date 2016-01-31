#!/bin/zsh
java -cp "lib/*:$JAVA_HOME/jre/lib/*:$FREGE_HOME/fregec.jar" frege.nativegen.Main -c com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.ObjectMapper,com.fasterxml.jackson.databind.JsonNode
java -cp "lib/*:$JAVA_HOME/jre/lib/*:$FREGE_HOME/fregec.jar" frege.nativegen.Main -c com.fasterxml.jackson.core.JsonProcessingException


