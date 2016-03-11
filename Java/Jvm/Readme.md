##The Virtual Machine

1. The javac command **compiles** the Higher Language to .class
2. .class is then interpreted by the java virtual machine intepreter


###Dynamic linking model
Java loads a class only when it is required in the memory else it will not load that class in the memory.

####Parts of the JVM

1. **Class loader** -- Loads the required classes in the memory
2. **Byte code Verifier** - Check and verifies the Byte, CAFEBABE!!
3. **Security Manager** -- Secutity of the system
4. **Execution Manager** - Execution
5. **Garbage Collector**


###Garbage Collection

1. **Stack** - References are stored here in the stack. Which go out of scope
2. **Heap** - Where the Actual objects reside in the memory.

###Heap Memory

1. It has the young generation
2. Old Generation
3. And the **Permanent Generation**


``````

for (int i = 0; i < 100000; i++) {
	///Write beautiful code :)
}

``````



