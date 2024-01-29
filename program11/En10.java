package program11;

public class En10 {
    private static int nextBookNumber = 1;
    int bookNumber;
    String bookTitle;
    String authorName;
    int publicationYear;

    public En10(String title, String author, int year) {
        bookTitle = title;
        authorName = author;
        publicationYear = year;
        bookNumber = nextBookNumber++;
    }

    public static void main(String[] args) {
        En10 book1 = new En10("三国志", "吉川英治", 1989);
        displayBookInfo(book1);

        En10 book2 = new En10("楊令伝", "北方謙三", 2011);
        displayBookInfo(book2);

        En10 book3 = new En10("竜馬がゆく", "司馬遼太郎", 1998);
        displayBookInfo(book3);

        En10 book4 = new En10("坊っちゃん", "夏目漱石", 1906);
        displayBookInfo(book4);

        En10 book5 = new En10("吾輩は猫である", "夏目漱石", 1905);
        displayBookInfo(book5);
    }

    private static void displayBookInfo(En10 book) {
        System.out.println("書    名：" + book.bookTitle);
        System.out.println("著 者 名：" + book.authorName);
        System.out.println("出 版 年：" + book.publicationYear);
        System.out.println("書籍番号：" + book.bookNumber);
    }
}