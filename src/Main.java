public class Main {



    public static void main(String[] args) {

        Author author1 = new Author(" Джек ", " Лондон ");
        Book book1 = new Book(" Белый клык ", 1906, author1);
        book1.setPublishingYear(1906);

        System.out.println(" Год публикации : " +book1.getPublishingYear());
        System.out.println(" Название книги :" +book1.getName()+" Автор книни :"+ author1.getFirstName() + author1.getFamilyName());


        Author author2 = new Author(" Алистер ", " Маклин ");
        Book book2 = new Book(" Медвежий остров ", 1971,author2);
        book2.setPublishingYear(1971);

        System.out.println(" Год публикации : " +book2.getPublishingYear());
        System.out.println(" Название книги : " +book2.getName()+" Автор книги : "+author2.getFirstName() + author2.getFamilyName());





        }



    }


