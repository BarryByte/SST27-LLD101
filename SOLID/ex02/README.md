# Exercise ex02

How to run:
```bash
cd src
javac Demo02.java
java Demo02
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test


Observations : 
Player.java is doing 3 things at once -> violating SRP
create interface for cache, decoder, render 

what if in future we use int[] instead of byte[] array ? 
