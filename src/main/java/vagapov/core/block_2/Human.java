package vagapov.core.block_2;

/**
 *Добавьте в класс Human 4 метода:
 * 1. getSecret()
 * 2. getNews()
 * 3. getExperience()
 * 4. getGossip()
 * которые помогут ему реализовать его желание делиться разной информацией с разными людьми.
 * Для этого используйте с методами нужные модификаторы доступа.
 *
 * Добавьте в класс конструктор для человека без секретов/новостей/опыта/сплетней (новорожденный)
 */
public class Human {
    private final String secret; //секретики
    private final String news; //новости
    private final String experience; //опыт
    private final String gossip; //сплетни

    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }

    // Твой код здесь

}
