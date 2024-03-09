package mediatheque;

public interface ItemVisitor {

    void visit(Book book_a_visiter);

    void visit (CD cd_a_visiter);
}
