package ua.bykadoroff.hw12;

import java.util.Optional;

class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";

        Optional<Integer> indexOfNumber = phoneBook.findIndexByPhoneNumber("016/161617");
        if (indexOfNumber.isPresent()){
            System.out.println("Index of number is " +indexOfNumber.get());
        } else {
            System.out.println("Not found");
        }
    }

    public Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (PHONE_BOOK[i].equals(phoneNumber) && PHONE_BOOK[i] != null) {
                return Optional.of(i);
            }
            }
            return Optional.empty();
    }
}

