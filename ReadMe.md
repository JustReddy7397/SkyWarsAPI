# SkyWarsAPI - The API for my SkyWars plugin

---
How to include my API into your project
Maven:
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	<dependency>
	    <groupId>com.github.JustReddy7397</groupId>
	    <artifactId>SkyWarsAPI</artifactId>
	    <version>1.0.0</version>
	</dependency>
```
Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.JustReddy7397:SkyWarsAPI:1.0.0"
}
```
---
Creating Cosmetics:
```java
package network.ranked.skywars.test;
import ga.justreddy.wiki.rskywars.skywarsapi.cosmetics.VictoryDance;
import ga.justreddy.wiki.rskywars.skywarsapi.entity.SkyWarsPlayer;

public class FireworkDance extends VictoryDance {

    public FireworkDance() {
        super(name, id, cost);
    }

    @Override
    public void start(SkyWarsPlayer winner) {
        // Victory Dance Start Logic
    }

    @Override
    public void stop(SkyWarsPlayer winner) {
        // Victory Dance Stop Logic
    }
}
```
