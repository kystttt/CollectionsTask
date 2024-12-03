package ru.naumen.collection.task1;

/**
 * Билет
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class Ticket {
    private long id;
    private String client;

    public Ticket(long id, String client) {
        this.id = id;
        this.client = client;
    }

    public long getId() {
        return id;
        //Я забыл, что нужно пул реквест кидать поэтому тут комментарий
    }
}

