abstract class shape{
    abstract void area(float a, float b);
}

class circle extends shape{
    void area(float radius,float pi){
        float circle_area=(pi)*radius*radius;
        System.out.println("the area of circle is - "+ circle_area);
    }
}
class rectangle extends shape{
    void area(float l,float b){
        float rectangle_area=l*b;
        System.out.println("the area of rectangle is - "+ rectangle_area);
    }
}
class assignment_question1 {
    public static void main(String[] args) {
        shape x=new circle();
        shape y=new rectangle();

        x.area(4f,3.14f);
        y.area(8f,90f);
    }
}
