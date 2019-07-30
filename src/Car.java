
// public abstract class Animal на основе абстракного класса не создают объекты, но его можно наследовать
// и создавать объекты еще бывают абстрактные функции они не имеют тела (то, что в фигурных скобочках)
// их обязательно использовать при наследовании
// серым подчеркивают переменные и методы, которые никогда не используются
public abstract class Car {
    String model;
    int speed;
    String color;

    void gas (int speed) {
        System.out.println("gas:" + speed);
            }

            void brake (int brake)
            {
                System.out.println("brake:" + brake);
            }



            // фигурные скобки подчеркивает, т.к. у абстрактного класса нет тела
            abstract void descriotion();
}

