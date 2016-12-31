# java_exercise_multi_process
An exercise project created to simulate a multi process java project
that creates orphaned processes.

How to run:
java -jar TestThreadMultiProcess.jar randomargs

if randomargs is provided then it will create two orphaned child processes
that will run infinitely but the parent process exits successfully. 
Otherwise, the parent process runs infinitely and no child process is created.
