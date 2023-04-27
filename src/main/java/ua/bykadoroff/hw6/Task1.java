package ua.bykadoroff.hw6;

public class Task1 {

    public static void main(String[] args) {
        Phone iphoneSE = new Phone();
        iphoneSE.number = "+380954793333";
        iphoneSE.model = "IphoneSE 2020";
        iphoneSE.weight = 148.12;
        System.out.println("Phone iphoneSE " + "number: " + iphoneSE.number
                + ", model: " + iphoneSE.model + ", weight: " + iphoneSE.weight);

        Phone samsungA51 = new Phone();
        samsungA51.number = "+380951346688";
        samsungA51.model = "Samsung A51";
        samsungA51.weight = 190.10;
        System.out.println("Phone Samsung A51 " + "number: " + samsungA51.number
                + ", model: " + samsungA51.model + ", weight: " + samsungA51.weight);

        Phone samsungJ6P = new Phone();
        samsungJ6P.number = "+380506449988";
        samsungJ6P.model = "Samsung J6 Plus";
        samsungJ6P.weight = 220.35;
        System.out.println("Samsung J6 Plus " + "number: " + samsungJ6P.number
                + ", model: " + samsungJ6P.model + ", weight: " + samsungJ6P.weight);

        iphoneSE.receiveCall("Max");
        System.out.println(iphoneSE.getNumber());

        samsungA51.receiveCall("Alex");
        System.out.println(samsungA51.getNumber());

        samsungJ6P.receiveCall("Unknow number");
        System.out.println(samsungJ6P.getNumber());

    }

}
