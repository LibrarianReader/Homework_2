public class Author_Test {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');

        author.getEmail();
        author.getGender();
        author.getName();

        author.setEmail(author.getEmail());

        String info = author.toString();
        System.out.println(info);
    }
}