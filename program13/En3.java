interface Person {
    void introduce();
}

class Teacher implements Person {
    private String name;
    private String job;
    private String subject;


    // コンストラクタ
    Teacher(String n, String s, String j) {
        // super();でPersonクラスのコンストラクタの呼び出し
        this.subject = s;
        this.job = j;
        this.name = n;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当教科：" + subject);
        System.out.println("");
    }
}

class Cook implements Person {
    private String name;
    private String job;
    private String specialties;

    // コンストラクタ
    Cook(String n, String j, String s) {
        // super();でPersonクラスのコンストラクタの呼び出し
        this.job = j;
        this.name = n;
        this.specialties = s;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
        System.out.println("");
    }
}

public class En3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");

        teacher.introduce();
        cook.introduce();
    }
}
