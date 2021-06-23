package day56_abstraction;

public interface Greeting {
    public abstract void hi();
    public abstract void bye();

    class GreetingActions {
        public static void main(String[] args) {
            MountainLanguage ml = new MountainLanguage();
            ml.hi();
            ml.bye();

            Greeting gt = new MountainLanguage();
            gt.hi();
            gt.bye();

            Japanese jp = new Japanese();
            jp.hi();
            jp.bye();

            gt = new Japanese();
            gt.hi();
            gt.bye();

        }
    }

    class Japanese implements Greeting {
        @Override
        public void hi() {
            System.out.println("Connijiwa -こんにちは");
        }

        @Override
        public void bye() {
            System.out.println("さようなら - Sayōnara");

        }
    }

    class MountainLanguage implements Greeting {
        @Override
        public void hi() {
            System.out.println("Sawaddee");
        }

        @Override
        public void bye() {
            System.out.println("La Kon");

        }
    }
}
