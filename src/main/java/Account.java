
    public class Account {
        private int id;
        private String name;
        private int number;
        private int balance;
        private String currency;

        public Account(int id, String name, int number, int balance, String currency) {
            this.id = id;
            this.name = name;
            this.number = number;
            this.balance = balance;
            this.currency = currency;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getNumber() {
            return number;
        }

        public int getBalance() {
            return balance;
        }

        public String getCurrency() {
            return currency;
        }
    }


