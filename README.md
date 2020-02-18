# PokeAPIJava
 Java Wrapper for https://pokeapi.co/
 
 Maintained by [Eyefyre](https://github.com/Eyefyre)
 
## Example
 Full Documentation and tests are coming soon
 ```
 public class PokeAPIJava {
    public static void main(String[] args) {
        PokeClient client = new PokeClient();
        Type fire = client.getType("fire");
        System.out.println(fire);
    }
}
```
