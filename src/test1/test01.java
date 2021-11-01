package test1;

class TestModEx {

    public static void main(String[] args) {

//        ---1
// final Object obj1 = new Object();
// final Object obj2 = new Object();
//
// System.out.println(obj1.equals(obj2));
// System.out.println(obj1 == obj2);
// System.out.println();

//        ---2
// final String str1 = new String("string");
// final String str2 = new String("string");
//
// System.out.println(str1.equals(str2));
// System.out.println(str1 == str2);
// System.out.println();

//        ---3
// final String str3 = "string";
// final String str4 = "string";
// final String str5 = "str" + "ing";
//
// System.out.println(str3.equals(str4));
// System.out.println(str3 == str4);
// System.out.println(str3 == str5);
// System.out.println();

//        ---4
// final Integer i1 = new Integer(1);
// final Integer i2 = new Integer(1);
//
// System.out.println(i1.equals(i2));
// System.out.println(i1 == i2);
// System.out.println();

//        ---5
// final Integer i3 = 128;
// final Integer i4 = 127 + 1;
//
// System.out.println(i3.equals(i4));
// System.out.println(i3 == i4);


//        on/off to test init block
//        TestModEx testModEx = new TestModEx();

}


        static {
            System.out.println("m1");
        }

        {
            System.out.println("m2");
        }

    public TestModEx() {
            System.out.println("m3");
        }

}

class A extends TestModEx {
    {
        System.out.println(1);
    }

    static {
        System.out.println(2);
    }

    public A(){
        System.out.println(3);
    }

    public static void main(String[] args) {
        A t = new A();
        System.out.println(4);


    }
}
