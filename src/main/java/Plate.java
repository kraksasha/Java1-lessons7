public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }

    public void decreaseFood(int amount, Cat cat) {
        if (food < amount){
            System.out.println("В тарелке мало еды. Кот по имени " + cat.getName() + " по прежнему голоден");
            System.out.println("Добавляем еды");
            addFood();
        } else {
            food -= amount;
            cat.setSatiety(true);
            System.out.println("Кот по имени " + cat.getName() + " сыт");
        }
    }

    public void addFood(){
        food = food + 10;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

}
