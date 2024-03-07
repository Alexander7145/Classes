public class Main {



    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName(" Белый клык ");
        System.out.println(" Название книги : " + book1.getName());
        book1.setPublishingYear(1906);
        Author author1 = new Author(" Джек ", " Лондон ");
        System.out.println(" Год публикации : " +book1.getPublishingYear());
        System.out.println(" Автор книни :"+ author1.getFirstName() + author1.getFamilyName());


        Author author = new Author("Алистер", " Маклин ");
        Book book2 = new Book(" Медвежий остров ", 1971,author);
        book2.setName(" Медвежий остров ");
        System.out.println(" Название книги : " +book2.getName());
        book2.setPublishingYear(1971);
        Author author2 = new Author(" Алистер ", " Маклин ");
        System.out.println(" Автор книги : " + author2.getFirstName()+ author2.getFamilyName());
        System.out.println(" Год публикации : " +book2.getPublishingYear());




        }



    }


