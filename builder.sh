#!/usr/bin/env bash
echo "Welcome to the proxy pattern compiler for the proxy builder"
#build the monitor
mvn clean package
mv target/state-gumball-1.0-SNAPSHOT-jar-with-dependencies.jar build/monitor.jar

#build the machine testdriver:
mvn clean package -Dmain.class=net.runnerdave.GumballMachineTestDrive
mv target/state-gumball-1.0-SNAPSHOT-jar-with-dependencies.jar build/runner.jar