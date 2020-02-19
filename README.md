# PokeAPIJava
 Java Wrapper for https://pokeapi.co/
 
 Maintained by [Eyefyre](https://github.com/Eyefyre)
 
## Example
 Full Documentation coming soon
 ```
 public class PokeAPIJava {
    public static void main(String[] args) {
        PokeClient client = new PokeClient();
        Type fire = client.getType("fire");
        System.out.println(fire);
    }
}
```
 This wrapper uses a caching system.
 When a method is called, the returned object is stored in a local cache,
 If the same method is called within a set time, the cache is used instead of the API being called.
 The user can set this time as shown below. Note that the time given is in seconds. The default time is 600 seconds/10 minutes
  ```
 public class PokeAPIJava {
    public static void main(String[] args) {
        PokeClient client = new PokeClient();
        client.changeCacheTimeAmount(60);
    }
}
```
