/ если дескрипшиа нет, начинает подчеркивать красным названием, ибо деск- абстракт и нужно обязатлеьно
public class My_car extends Car {

    // вот зачем это написали непонятно????
public static void main(String[] args) {


    // создали объект тойота класса майкар, кот наследуется от кар
    My_car bus = new My_car("456", 4, "красній");
    bus.descriotion();
    bus.gas(4);
    bus.brake(56);

}
    My_car (String model,
            int speed,
            String color)
    {this.model= model;
        this.speed = speed;
        this.color=color;}
// анотация - оверайд, переопределение метода. он необязательно абстрактный, мог быть и нормальный
    // методы называются одинаково
    // похоже на перегрузку, но работает методов с одинаковыми названиями, которые находятся в разных классах,
    // но при этом классы наследуются или имеют другую заваисимость


@Override
void descriotion(){
    String a = model;
    int b = speed;
    String c = color;

    System.out.println("model"+a);
    System.out.println(b);
    System.out.println(c);
}
}


