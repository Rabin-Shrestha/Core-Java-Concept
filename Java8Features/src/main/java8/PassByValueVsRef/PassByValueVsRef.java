package main.java8.PassByValueVsRef;

public class PassByValueVsRef {
    public static void main(String[] args) {
        User user1 = new User("Rabin", 20);
        User user2 = new User("Sabin", 30);
        PassByValueVsRef ob = new PassByValueVsRef();
        ob.swap(user1, user2);
        System.out.println(user1);
    }

    void swap(User u1, User u2)
    {
        User temp;
        temp=u1;
        u1= u2;
        u2= temp;
        u2.setName("Updated Name u2");
    }
}
class User
{
    String name;
    Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
