Here is reproducible code for https://hibernate.atlassian.net/browse/HHH-10978 .

Download `sqljdbc42.jar` from [Microsoft site](https://www.microsoft.com/en-us/download/details.aspx?displaylang=en&id=11774) and copy it into `lib` directory.

    mvn clean compile exec:java -Dexec.mainClass=com.github.yukihane.hello.java.jpa.jpa.JpaTest -Dexec.classpathScope=compile
