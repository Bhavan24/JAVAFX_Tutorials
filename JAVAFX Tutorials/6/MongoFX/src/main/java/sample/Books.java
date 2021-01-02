package sample;

public class Books {
    String id, ISBM_number, name, author, editor, publisher;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getISBM_number() {
        return ISBM_number;
    }

    public void setISBM_number(String ISBM_number) {
        this.ISBM_number = ISBM_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Books(String id, String ISBM_number, String name, String author, String editor, String publisher) {
        this.id = id;
        this.ISBM_number = ISBM_number;
        this.name = name;
        this.author = author;
        this.editor = editor;
        this.publisher = publisher;
    }
}
