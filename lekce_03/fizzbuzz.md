
```
class Main {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(spocitejFizzBuzz(i));
    }
  }

  static String spocitejFizzBuzz(int i){
    if (i % 15 == 0 ){
        return "FizzBuzz";
    }
    if (i % 5 == 0 ){
        return "Buzz";
    }
    if (i % 3 == 0 ){
        return "Fizz";
    }
    return String.valueOf(i);  
  }
}
```
