public class Main {
    //Напишите пример обработки нескольких исключений в одном блоке catch

    public static void main(String[] args) {
        try {
            //  ...
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
