package mediatheque;

public class CDPrinter implements ItemVisitor{
    /**
     * @param book_a_visiter
     * Ignore les books
     */
    @Override
    public void visit(Book book_a_visiter) {

        //Ne rien faire

    }

    /**
     * @param cd_a_visiter
     *
     * Appelle la méthode print des livres
     */
    @Override
    public void visit(CD cd_a_visiter) {

        cd_a_visiter.print();

    }
}
