public class Main {
    public static void main(String[] args) {
        Cat cats[] = new Cat[5];
        cats[0] = new Cat("Barsik", 5, false);
        cats[1] = new Cat("Vovka", 7, false);
        cats[2] = new Cat("Pyshok", 3, false);
        cats[3] = new Cat("Dimok", 8, false);
        cats[4] = new Cat("Bysinka", 6, false);

        Plate plate = new Plate(28);
        plate.info();
        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate,cats[i]);
            if (cats[i].isSatiety() != true){
                i--;
            }
            plate.info();
        }
    }

}
