public class Cat {
    //���� ������
    private double weight;
    private String name;
    private int age;
    private String color;

    //����������� �� ���������
    public Cat() {
        this(3000, "Barsik", 1, "Grey");
    }

    //�����������, ����������� ���������
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //������ ������
    public void meow() {
        System.out.println("Meow");
    }

    private void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 50;
        //���� �������� ���� �������, ���� ����
        if (50 / weight > .01)
            pee();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //����� �� ��������
        if (age > this.age)
            this.age = age;
    }
}