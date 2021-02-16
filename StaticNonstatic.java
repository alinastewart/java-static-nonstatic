public class StaticNonstatic {
  // Static method
  static void myStaticMethod() {
    System.out.println("Called without creating object");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Called by creating object");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    StaticNonstatic myObj = new StaticNonstatic(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}