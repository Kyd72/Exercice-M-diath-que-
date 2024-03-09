package mediatheque;

public class BookPrinter implements ItemVisitor {



    /**
     * @param book_a_visiter
     *
     * Fait appel à la méthode print des Books
     *
     */
    @Override
    public void visit(Book book_a_visiter) {

        book_a_visiter.print();

    }

    /**
     * @param cd_a_visiter
     *
     * Ignore les CD
     */
    @Override
    public void visit(CD cd_a_visiter) {

        //Ne rien faire

    }
}
