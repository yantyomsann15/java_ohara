abstract class Person {
    String name;
    String job;

    // 抽象メソッド introduce
    public abstract void introduce();

    // コンストラクタ
    Person(String n, String j) {
        name = n;
        job = j;
    }
}

class Teacher extends Person {
    String subject;

    // コンストラクタ
    Teacher(String n, String j, String s) {
        // super();でPersonクラスのコンストラクタの呼び出し
        super(n, j);
        // subjectのコンストラクタ
        this.subject = s;
    }

    // 抽象メソッドを実装
    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当教科：" + subject);
    }
}

class Cook extends Person {
    String specialties;

    // コンストラクタ
    Cook(String n, String j, String s) {
        // super();でPersonクラスのコンストラクタの呼び出し
        super(n, j);
        // specialtiesのコンストラクタ
        this.specialties = s;
    }

    // 抽象メソッドを実装
    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
    }
}

public class En1 {
    public static void main(String[] args) {
        Teacher kondo = new Teacher("竹井一馬", "教員", "情報処理");
        Cook okita = new Cook("大原太郎", "シェフ", "オムライス");

        kondo.introduce();
        okita.introduce();
    }
}
