<h2>Item16 : public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라.</h2>
<h3>1. 인스턴스 필드를 모아 놓는 퇴보한 클래스를 작성하지 말자.</h3>     

```java   
  class Point{
    public double x;
    public double y;
```    
   
* API를 수정하지 않고는 내부 표현을 바꿀 수 없다.   
* 불변식을 보장할 수 없다. 
  * 클라이언트가 직접적으로 필드에 접근하고 있어 클라이언트에 의해 언제든지 변경이 가능하다.
* 외부에서 필드에 접근할 때 부수적인 로직을 추가할 수 없다.    
  * Point.x라는 필드를 조회했을 떄 부수적인 로직(ex.계산)을 추가 할 수가 없다.

<h3>2. 접근 변경자를 활용해 데이터를 캡슐화 한다. </h3>
```java   
 class Point {
  private double x;
  private double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() { return x; }
  public double getY() { return y; }

  public void setX(double x) { this.x = x; }
  public void setY(double y) { this.y = y; }
}
```
* 클래스의 내부 표현 방식을 언제든 바꿀 수 있는 유연성을 제공하게 된다.
  * getter/setter 혹은 또 다른 메소드를 통해 로직을 언제든 추가할 수 있다.
* public 클래스가 필드값을 공개(pubilc 접근자)하게 되면 이를 사용하는 클라이언트가 생겨날 것이므로 내부 표현방식을 마음대로 바꿀 수 없게 된다.
  * 하지만, package-private 클래스 혹은 private 중첩 클래스라면 데이터 필드를 노출한다고 해도 문제될 것이 없다.
    * Package-private : 같은 패키지 및 같은 클래스에서만 접근 가능
    * private 중첩 클래스 : 내부 클래스가 private 형태로 된 클래스