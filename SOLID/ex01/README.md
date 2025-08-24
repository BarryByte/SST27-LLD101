# Exercise ex01

How to run:
```bash
cd src
javac Demo01.java
java Demo01
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test


Observations : 
1. new object EmailClient is created in the orderService. -> violating Dependency Inversion Principle -> create an interface and initialize a new object in the Driver code (main file).

2. Order service is doing too many things 
