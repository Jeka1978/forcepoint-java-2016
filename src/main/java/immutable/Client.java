package immutable;

import lombok.Getter;
import lombok.ToString;

/**
 * Created by Jeka on 08/09/2016.
 */
@Getter
@ToString
public class Client {
    private final String name;
    private final int bonus;
    private final int debt;

    private Client(String name, int bonus, int debt) {
        this.name = name;
        this.bonus = bonus;
        this.debt = debt;
    }

    public Client addBonus(int delta) {
        return new Client(name, bonus + delta, debt);
    }

    public static class Builder{
        private String name;
        private int bonus;
        private int debt;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }
        public Client build() {
            validate();
            Client client = new Client(name, bonus, debt);
            clean();
            return client;
        }

        private void clean() {
            name=null;
            debt=0;
            bonus=0;
        }

        private void validate() {
            if (name == null) {
                throw new RuntimeException("name can't be null");
            }
        }
    }



}
