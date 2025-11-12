public class AllAboutTriangles {
    public static class Triangle {
            //instance variables
            private double smallSide;
            private double mediumSide;
            private double longSide;

            //default constructor
            public Triangle(){
                smallSide = 3;
                mediumSide = 4;
                longSide = 5;
            }

            //parameter constructors
            //Triangle tri5 = new Triangle(4, 7.25, 4);
            public Triangle(double a, double b, double c) {
                if (a > b && a > c) {
                    longSide = a;
                    if (b>=c) {
                        mediumSide = b;
                        smallSide = c;
                    } else if (b <= c) {
                        mediumSide = c;
                        smallSide = b;
                    }
                } else if (b > a && b > c) {
                    longSide = b;
                    if (a>=c) {
                        mediumSide = a;
                        smallSide = c;
                    } else if (c >= a) {
                        mediumSide = c;
                        smallSide = a;
                    }
                } else if (c > a && c > b) {
                    longSide = c;
                    if (a >= b) {
                        mediumSide = a;
                        smallSide = b;
                    } else if (b >= a) {
                        mediumSide = b;
                        smallSide = a;
                    }
                }
            }

            //mutator
            public void setSmallSide(double a){
                smallSide = a;
            }

            public void setMediumSide(double b){
                mediumSide = b;
            }

            public void setLongSide(double c){
                longSide = c;
            }

            //accessor
            public double getSmallSide(){
                return smallSide;
            }

             public double getMediumSide(){
                return mediumSide;
            }

             public double getLongSide(){
                return longSide;
            }

            //methods
            public boolean isTriangle() {
                if ((smallSide + mediumSide > longSide) && (smallSide + longSide > mediumSide) && (mediumSide + longSide > smallSide)) {
                    return true;
                } else {
                    return false;
                }
            }

            public boolean isRightTriangle() {
                double smallSideSquared = Math.pow(smallSide, 2);
                double mediumSideSquared = Math.pow(mediumSide, 2); 
                double longSideSquared =  Math.pow(longSide, 2);

                if (smallSideSquared + mediumSideSquared == longSideSquared) {
                    return true;
                } else if (longSideSquared - (smallSideSquared + mediumSideSquared) <= 0.1) {
                    return true;
                } else {
                    return false;
                }

            }

            public double perimeter() {
                double perimeter = smallSide + mediumSide + longSide;
                return perimeter;
            }

            public double area(){
                double perimeterForArea = (perimeter()/2);
                double area = Math.sqrt(perimeterForArea * (perimeterForArea - smallSide) * (perimeterForArea - mediumSide) * (perimeterForArea - longSide));
                return area;
            }

            public void displayTriangle(){
                System.out.println("Small Side: " + smallSide);
                System.out.println("Medium Side: " + mediumSide);
                System.out.println("Long Side: " + longSide);
            }
            

        }
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        Triangle tri2 = new Triangle(27, 12, 13.5);
        Triangle tri3 = new Triangle(9, 7.5, 3.1);
        Triangle tri4 = new Triangle(8.54, 3, 8);
        Triangle tri5 = new Triangle(4, 7.25, 4);

    System.out.println("Tri #3 Area: " + tri3.area());
    //Tri #3 Area: 10.991560398778699
    System.out.println(tri4.isRightTriangle());
    //true
    tri5.displayTriangle();    
    }
}
