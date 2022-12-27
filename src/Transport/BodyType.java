package Transport;

public enum BodyType {

        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        VAGON("Универсал"),
        JEEP("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");

        private final String body;

        BodyType(String body) {
                this.body = body;
        }

        public String getBody() {
                return body;
        }

        @Override
        public String toString() {
                return "Тип кузова: " + getBody();
        }
}



