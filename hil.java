class Hillstations {
    void location() {
        System.out.println("Location is:");
    }

    void famousfor() {
        System.out.println("Famous for:");
    }
}

class Murree extends Hillstations {
    void location() {
        System.out.println("Murree is in Punjab, Pakistan");
    }

    void famousfor() {
        System.out.println("It is famous for Mall Road and pleasant weather");
    }
}

class Hunza extends Hillstations {
    void location() {
        System.out.println("Hunza is in Gilgit-Baltistan, Pakistan");
    }

    void famousfor() {
        System.out.println("It is famous for its beautiful valleys and mountains");
    }
}

class Swat extends Hillstations {
    void location() {
        System.out.println("Swat is in Khyber Pakhtunkhwa, Pakistan");
    }

    void famousfor() {
        System.out.println("It is famous for its scenic beauty and tourist attractions");
    }
}
class hil {
    public static void main(String args[]) {

        Hillstations A = new Murree();

        Hillstations H = new Hunza();

        Hillstations S = new Swat();

        A.location();
        A.famousfor();

        H.location();
        H.famousfor();

        S.location();
        S.famousfor();
    }
}