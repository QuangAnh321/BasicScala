package chapter5

class PersonAuxiliary {

  private var name = ""
  private var age = 0

  /**
   * auxiliary constructor, must call to an already
   * defined auxiliary constructor or primary constructor
    */
  def this(name: String) {
    // Primary constructor
    this()
    this.name = name
  }

  /**
   * This auxiliary constructor call to the previous  auxiliary constructor
   * @param name
   * @param age
   */
  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
}
