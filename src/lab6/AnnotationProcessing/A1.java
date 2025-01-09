package lab6.AnnotationProcessing;

class A1 extends Entity2 {
    @ToString2("YES")
    String hello = "hello";

    @ToString2("YES")
    int x = 42;

    @ToString2("NO")
    String anotherField = "another";
}