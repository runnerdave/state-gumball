# State and Proxy Design Patterns code

This repo shows a working example of the Gumball Machine from the Head 
First Design Patterns book.

It also contains two files with class diagrams, one opens with UMLet and 
the other with the Eclipse Plugin: Object Aid

## The master branch contains the State Design Pattern only

## The branch at proxy-branch contains work on the Proxy Design Pattern

To compile and run this proxy example run maven compile like this:

`$builder.sh`

This creates two artifacts in the `build` directory:
 * monitor.jar
 * runner.jar
 
then use the artifact created to start an instance of the runner with the following 
parameters, in a separate terminal window:

`$java -jar build/runner.jar 300 santafe.mightygumball.com`

then start the monitor: 

`$java -jar build/monitor.jar`

you should be able to see in the monitor the value entered in the server
