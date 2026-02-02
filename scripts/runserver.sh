#!/bin/bash
# Bash script for launching one Minecraft server instance

worldName="default"
serverFile="minecraft*.jar"
parentFolder="/srv/mcservermanager"

cd $parentFolder
java -Xms4G -Xmx4G -XX:SoftMaxHeapSize=2G -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -jar $serverFile --nogui --world $worldName
