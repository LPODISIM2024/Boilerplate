# COMPILARE

```mvn clean compile```

o

```mvn compile```

Se non volete pulire i file temporanei. ```clean``` è usbile con tutti i seguenti comandi.

# TESTARE

Se ci sono classi di test e librerie di test (Junit) è possibile lanciare i test case

```mvn test```

# CREARE ARCHIVIO

```mvn package```

Nel caso dei vostri progetti genera un file jar nella cartella target.

# INSTALLARE NEL REPOSITORY LOCARE

```mvn install```

# LANCIARE UN PROGETTO JAVA DA TERMINALE

```mvn exec:java -Dexec.mainClass="change.it.Runner"```

Se avete usato il pluging ```org.codehaus.mojo.exec-maven-plugin``` potete evitare di usare il parametro ```-Dexec.mainClas``` perchè il main è definito direttamtente all'interno del pom file.

Con ```-Dexec.args```posso specificare gli argomenti da command line. I parametri devono essere separati da spazio.



