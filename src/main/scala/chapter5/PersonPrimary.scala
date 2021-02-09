package chapter5

/**
 * Using primary constructor, equivalent to the following in Java:
 * {{{
 *  public class Person {
 *   private String name;
 *   private int age;
 *   public Person(String name, int age) {
 *   this.name = name;
 *   this.age = age;
 *   }
 *   public String name() { return this.name; }
 *   public int age() { return this.age; }
 *   ...
 *  }
 * }}}
 *
 * @param name
 * @param age
 */
class PersonPrimary(val name: String, val age: Int) {

  // Will be executed when when Person3 object is created
  println("This is Person3")
}
