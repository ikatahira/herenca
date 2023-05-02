public class Principal{

    public static void main(String args[]){
      Dog dog =new Dog("Neguinha",13);

      System.out.println(dog.getNome());
      System.out.println(dog.getIdade());

      Cat cat =new Cat("Coxinha",3);

      System.out.println(cat.getNome());
      System.out.println(cat.getIdade());
    }
}