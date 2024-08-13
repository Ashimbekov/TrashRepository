package HM;

public class Homework {
    private static final String OPEN_TAG = "<data>";
    private static final String CLOSE_TAG = "</data>";
    private static final String EMAIL_SYMBOL = "@";
    private static final String DECIMETER_SYMBOL = ";";
    private static final String MASKING_SYMBOL = "*";
    private static final String DOT_SYMBOL = ".";
    private static final String SPACE_SYMBOL = " ";

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double height = sc.nextDouble();
//        double weight = sc.nextDouble();
//
//        double indexMassBody = weight / (height * height);
//
//        System.out.println(indexMassBody);

//        int ageChildren = 17;
//
//        if (ageChildren >= 3 && ageChildren < 6) {
//            System.out.println("В садик");
//        } else if (ageChildren >= 6 && ageChildren < 11) {
//            System.out.println("В младшую школу");
//        } else if (ageChildren >= 11 && ageChildren < 17) {
//            System.out.println("В среднию школу");
//        } else {
//            System.out.println("В университет");
//        }

//        boolean chicken = false;
//        boolean vegetables = true;
//        boolean sour = true;
//        boolean toast = true;
//        boolean sausage = true;
//        boolean eggs = false;
//
//        boolean caesar = chicken && vegetables && sour && toast;
//
//        if (chicken && vegetables && sour && toast) {
//            System.out.println("Цезарь");
//        } else if (vegetables && (sausage || chicken) && eggs) {
//            System.out.println("Оливье");
//        } else if (vegetables){
//            System.out.println("Овощной салат");
//        } else {
//            System.out.println("Нет ингредиетов");
//        }

//        String num_str = "234";
//        String str = "some_text";
//
//        int str_len = str.length();
//        int num = Integer.parseInt(num_str);
//
//        num += str_len;
//        System.out.println(num);

        String testData = "<client><data>79991113344;test@yandex.ru;Иванов Иван Иванович;</data></client>";
//        String testData2 = "<client><data></data></client>";
        System.out.println(masking(testData));
//        System.out.println(masking(testData2));
    }

    public static String masking(String text){
        int indexStartData = text.indexOf(OPEN_TAG) + OPEN_TAG.length();
        int indexEndData = text.indexOf(CLOSE_TAG, indexStartData);

        if ((indexEndData - indexStartData) > 0) {
            String clientData = text.substring(indexStartData, indexEndData);
            return new StringBuilder()
                    .append(text, 0, indexStartData)
                    .append(maskingHelper(clientData))
                    .append(text.substring(indexEndData))
                    .toString();
        }

        return text;
    }

    private static String maskingHelper(String clientData){
        StringBuilder result = new StringBuilder();
        for (String field : clientData.split(DECIMETER_SYMBOL)) {
            System.out.println(field);
            if (field.contains(EMAIL_SYMBOL)) {
                maskingEmail(field, result);
            } else if (hasOnlyDigits(field)){
                maskingNumber(field, result);
            } else {
                maskingFio(field, result);
            }
        }


        return result.substring(0, result.length() - 1);
    }

    private static void maskingFio(String field, StringBuilder result) {
        int indexFirstName = field.indexOf(" ");
        int indexSecondName = field.indexOf(" ", indexFirstName + 1);


        result.append(new StringBuilder()
                .append(field, 0, 1)
                .append(MASKING_SYMBOL.repeat(indexFirstName - 2))
                .append(field, indexFirstName - 1, indexFirstName)
                .append(SPACE_SYMBOL)
                .append(field, indexFirstName + 1, indexSecondName)
                .append(field, indexSecondName, indexSecondName + 2)
                .append(DOT_SYMBOL)
                .append(DECIMETER_SYMBOL));
    }

    private static void maskingEmail(String field, StringBuilder result) {
        int emailIndex = field.indexOf(EMAIL_SYMBOL);
        int dotIndex = field.indexOf(DOT_SYMBOL, emailIndex);


        result.append(new StringBuilder()
                .append(field, 0, emailIndex - 1)
                .append(MASKING_SYMBOL)
                .append(EMAIL_SYMBOL)
                .append(MASKING_SYMBOL.repeat(dotIndex - emailIndex - 1))
                .append(field.substring(dotIndex))
                .append(DECIMETER_SYMBOL));

    }

    private static void maskingNumber(String field, StringBuilder result) {
        result.append(new StringBuilder()
                .append(field, 0, 4)
                .append(MASKING_SYMBOL.repeat(3))
                .append(field, 7, field.length())
                .append(DECIMETER_SYMBOL));

    }

    private static boolean hasOnlyDigits(String field){
        String digits = "0123456789";
        boolean onlyDigit = true;
        for (String letter : field.split("")) {
            if(!digits.contains(letter)){
                return false;
            }
        }
        return true;

    }
}
