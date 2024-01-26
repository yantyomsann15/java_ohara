interface Person3 {
    void introduce();
}

class Teacher3 implements Person3 {
    private String name;
    private String job;
    private String subject;


    // コンストラクタ
    Teacher3(String n, String s, String j) {
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

class Cook3 implements Person3 {
    private String name;
    private String job;
    private String specialties;

    // コンストラクタ
    Cook3(String n, String j, String s) {
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
        Teacher3 teacher = new Teacher3("竹井一馬", "教員", "情報処理");
        Cook3 cook = new Cook3("大原太郎", "シェフ", "オムライス");

        teacher.introduce();
        cook.introduce();
    }
}
