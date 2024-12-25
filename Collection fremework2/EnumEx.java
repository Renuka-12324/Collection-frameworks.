import java.util.EnumSet;

class EnumEx {
    enum Size {SMALL, MEDIUM, LARGE, EXTRALARGE}

    public static void main(String[] args) {
//        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
//        System.out.println("EnumSet: " + sizes);

//        EnumSet<Size> sizes = EnumSet.noneOf(Size.class);
//        System.out.println("EnumSet: " + sizes);

        EnumSet<Size> sizes = EnumSet.range(Size.MEDIUM,Size.EXTRALARGE);
        System.out.println("EnumSet: " + sizes);


    }
}
